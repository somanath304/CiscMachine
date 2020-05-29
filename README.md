# CiscMachine

**Introduction**

This JAVA application will execute Load and Store instructions which will move data from/to a register and memory. The application executes six functions – LDR, STR, LDA, LDX, STX and HLT. The flow in which these instructions get executed will be described in following part. We have used NetBeans IDE.

Simulator Layout

GUI interface consists of text fields and buttons. 
R0, R1, R3, R4 are General Purpose Registers. 
IPL Button – On clicking this button, all objects will be set to 0, and PC will be to address of first instruction. The list of instructions will be presented in the GUI.
Single Step Button - On clicking this button, instructions will be executed one by one.(1 fetch/execute cycle)
Execute Button - On clicking this button, the entire program will get executed. 
Logger – This field will display the flow in which the address gets shifted to different registers and the register in which the value gets stored, as well as the data move from/to memory.
PC: Program Counter points to the next instruction to be executed.
MAR: The Memory Address Register holds the address of the main memory to or from which data is to be transferred.
MBR: The Memory Buffer Register holds the data to be written into or read from the main memory.
IR: Instruction Register holds the instruction to be executed.

The program will run only for following methods. So, the inputs can not be other than these instructions.
1.	LDR r, ireg, I, address
This instruction load register from the mentioned memory address.

2.	STR r, ireg, I, address
This instruction stores value of mentioned register to the given address.

3.	LDA r, ireg, I, address
Address from the instruction moves into r from the instruction.

4.	LDX ireg, I, address 
Index Register will get loaded with the contents of the memory address.

5.	STX ireg, I, address
This instruction will store the contents of index register to mentioned memory address.

6.	HLT r, ireg, I, address
This instruction will halt the program from executing. And the value of all parameters will be 0.


Design notes
It is worth pointing out that we have added comments in our code to make it easier to understand. The brief description of our code is as follows.

We have created 3 classes, which are Frame1.java, ParseInstru.java and helper.java.
Frame1.java: This is our main class. initComponents() will initialize everything. Upon execution of this method the layout of all text fields and buttons will get set, in addition to this accessible name will get set to jLabel.
Execute_Ins() will display result on logger after the execution of instruction.  
fetch_from-memory() method will fetch instruction from given memory address.
parse_instruction_method() will divide instruction into 5 parts and each part will be included in array to store them.
Helper.java: We have created method, named dectoBinary. This method will convert decimal value to binary value. There is another method named binarytoDec which will convert binary value to decimal.
