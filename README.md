📦 Custom Packer Unpacker (Java)








A Custom File Archiver Utility implemented in Java that packs multiple files from a directory into a single archive file and later restores them back to their original form.

This project demonstrates low-level file handling, byte stream processing, and custom archive format design using Java I/O streams.

It works similarly to tools like ZIP / TAR, but the packing logic is implemented manually to understand system-level file operations.

📑 Table of Contents

Project Overview

Features

Technologies Used

Project Structure

System Architecture

Archive File Format

Packing Algorithm

Unpacking Algorithm

Installation & Execution

Example Execution

Limitations

Future Improvements

Learning Outcomes

Author

📌 Project Overview

The Custom Packer Unpacker project consists of two Java programs.

Program	Description
Program327.java	Packs all files from a directory into one archive file
Program328.java	Extracts files from the archive

The packer reads files from a directory and stores them sequentially into a single packed file along with metadata.

🚀 Features

✔ Pack multiple files into a single archive
✔ Restore files with original names and data
✔ Custom archive format implementation
✔ Efficient byte-level file processing
✔ Simple command-line interface
✔ Works with any file type

🛠 Technologies Used

Java

Java IO Package

FileInputStream

FileOutputStream

File Handling

Scanner

Byte Arrays

📂 Project Structure
Custom-Packer-Unpacker
│
├── Program327.java      # File Packer
├── Program328.java      # File Unpacker
└── README.md
🏗 System Architecture
              +---------------------+
              |  Input Directory    |
              | (Multiple Files)   |
              +----------+----------+
                         |
                         | Read Files
                         ▼
               +-------------------+
               |   Packer Program  |
               |   (Program327)    |
               +---------+---------+
                         |
                         | Header + Data
                         ▼
                 +---------------+
                 | Packed File   |
                 |  Packed.dat   |
                 +---------------+
                         |
                         | Read Header & Data
                         ▼
               +-------------------+
               |  Unpacker Program |
               |   (Program328)    |
               +---------+---------+
                         |
                         ▼
                +----------------+
                | Restored Files |
                +----------------+
📦 Archive File Format

The packed file stores data using the following format:

---------------------------------------------------------
| Header (100 Bytes) | File Data | Header | File Data |
---------------------------------------------------------

Each file stored in the archive contains:

1️⃣ Header (Metadata)
2️⃣ Actual File Data

📄 Header Format
<FileName> <FileSize>

Example:

notes.txt 150

To simplify unpacking, the header is padded with spaces until it reaches exactly 100 bytes.

Example:

notes.txt 150________________________________________
(total size = 100 bytes)
📦 Packing Algorithm (Program327)

Accept directory name from user.

Accept packed file name.

Create packed file.

Verify directory exists.

Retrieve all files from directory.

For each file:

Create header using file name and file size.

Pad header to 100 bytes.

Write header into packed file.

Read file data using FileInputStream.

Write data into packed file using FileOutputStream.

Repeat for all files.

📤 Unpacking Algorithm (Program328)

Accept packed file name from user.

Open packed file using FileInputStream.

Read first 100 byte header.

Extract:

File Name

File Size

Create new file using extracted name.

Read file data according to stored file size.

Write data into new file.

Repeat until the end of packed file.

💻 Installation & Execution
Step 1 — Clone Repository
git clone https://github.com/yourusername/Custom-Packer-Unpacker.git
Step 2 — Compile Programs
javac Program327.java
javac Program328.java
Step 3 — Run Packer
java Program327

Example Input

Enter the name of Directory which contains all files that you want to pack:
Demo

Enter the name of packed file that you want to create:
Packed.dat
Step 4 — Run Unpacker
java Program328

Example Input

Enter the name of packed file that you want to unpack:
Packed.dat

The program will restore the original files.

🖥 Example Execution
Packing
------------------------------------------------
---------- Custome Packer Unpacker ----------
------------------------------------------------

Number of files in the directory are : 3

Packing activity started...

File packed with the name : notes.txt
File packed with the name : data.txt
File packed with the name : info.txt

Packing activity completed..
Total file packed successfully : 3
Unpacking
---------------------------------------------
-------- Custome Packer Unpacker ---------
---------------------------------------------

notes.txt unpacked successfully
data.txt unpacked successfully
info.txt unpacked successfully

Unpacking Activity Completed...
Total File unpacked successfully : 3
⚠ Limitations

Current implementation has some limitations:

No compression

No encryption

No nested directory support

Fixed header size

🔮 Future Improvements

Possible enhancements:

File compression

Password-protected archives

Recursive directory packing

Graphical User Interface (GUI)

Progress indicator

Custom archive extension (.pck)

Data integrity verification

🎯 Learning Outcomes

This project helps understand:

Java File Handling

Binary File Processing

Custom Archive Format Design

Byte Stream Operations

Directory Traversal

Metadata Storage

👨‍💻 Author

Pravin

Aspiring Java Developer

Interested in:

Backend Development

Data Structures

System Programming

File System Design

⭐ If you like this project, consider starring the repository
