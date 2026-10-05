the algorithmImages contain images of experiments named in the form experiment 1: exp1,exp1.1,... and experiement 2: exp2,exp2.1,...etc.
make folders for each experiment exp1,exp2,exp3,... in the root
inside each folder there must be particular java program codes made from the algorithm image, a rightside.txt file (with the AIM: and also the  ALGORITHM:) and a output.txt file with the exact output, user inputs and resultand output basically copy of the terminal text without the user and folder locations.
additionally, OOPS.docx rules:
- copy every experiment's program codes and outputs into OOPS.docx in the root as plain text with the document's current formatting, no styling.
- label each program with its file path relative to its exp folder only (e.g. palindrome.java, pkg1/ClassA.java) - never expN/... from the root.
- every line of code and output must be complete, nothing cut, since the document gets printed and cutouts are made from it.
- layout per experiment: "EXP n" heading, then an empty line, then the code (for multiple files: each file's label + code with an empty line between files), then an empty line, "OUTPUT:", then an empty line, then the output lines, then an empty line before the next experiment.
- page breaks: allowed between blocks (between experiments, between code files, between code and OUTPUT:), never inside a block of code or inside a block of output, unless a single block is taller than one page (overflow).
- closing Word before running the scripts is required or the save fails with PermissionError.
- scripts: python copy_to_docx.py appends everything to the docx; python fix_docx_layout.py rebuilds the whole document canonically from the exp folders (also refreshes stale content and re-applies the page-break rules). run fix_docx_layout.py after appending or whenever the layout needs fixing.
