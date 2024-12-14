# JAVA SWING NOTES

NOTES:
### Explanation of `JFrameDemo` and JFrameOne and JFrameTwo

The `JFrameDemo` class demonstrates how to create and display two `JFrame` windows using different approaches. It uses the SwingUtilities class to ensure that the creation of Swing components occurs on the Event Dispatch Thread (EDT), which is the recommended way to create and manage GUI components in Java Swing for thread safety.

#### Key Points in `JFrameDemo`:
1. **SwingUtilities.invokeLater()**:
   - This ensures that the initialization of Swing components (`JFrameOne` and `JFrameTwo`) is executed on the EDT.
   - The `run()` method in the `Runnable` is called, where instances of `JFrameOne` and `JFrameTwo` are created.

2. **`JFrameOne` and `JFrameTwo`**:
   - These are two different ways to define and use a `JFrame`.

---

### First Approach: Extending `JFrame` (`JFrameOne`)

This approach directly inherits from the `JFrame` class.  
All the JFrame methods and properties are available directly without requiring an explicit reference to a `JFrame` instance.

#### Key Features of `JFrameOne`:
1. **Inheritance**:
   - By extending `JFrame`, this class becomes a type of `JFrame`.
   - You can call methods like `setTitle()`, `setDefaultCloseOperation()`, etc., directly.

2. **Initialization in Constructor**:
   - The `initialize()` method is called in the constructor to set up the properties of the JFrame.
   - The window is centered using `setLocationRelativeTo(null)`.

3. **Visibility**:
   - The `setVisible(true)` call ensures the frame is displayed once it is initialized.

#### Advantages of Extending `JFrame`:
- Simplifies code when the class represents a JFrame directly.
- No need to use an explicit JFrame variable inside the class.

#### Disadvantages:
- Limits flexibility as the class is tightly coupled to JFrame inheritance.
- Java does not allow multiple inheritance, so extending another class simultaneously becomes impossible.

---

### Second Approach: Using `JFrame` as a Private Member (`JFrameTwo`)

This approach uses composition by creating a private instance of `JFrame` within the class.

#### Key Features of `JFrameTwo`:
1. **Composition**:
   - Instead of extending `JFrame`, the class contains an instance of `JFrame` as a private member.
   - Methods like `setTitle()` and `setDefaultCloseOperation()` require referencing the `frame` object explicitly (e.g., `this.frame.setTitle()`).

2. **Encapsulation**:
   - The JFrame object (`frame`) is private, so its implementation details are hidden from the outside world.

#### Advantages of Composition:
- More flexible than inheritance since the class is not tightly coupled to JFrame.
- The class can extend other classes or implement other interfaces if needed.

#### Disadvantages:
- Code verbosity due to explicit references to the private `frame` object.
- Slightly more complex syntax (e.g., `this.frame.setTitle()` instead of `setTitle()`).

---

### Why `SwingUtilities.invokeLater()`?

The `SwingUtilities.invokeLater()` ensures that GUI-related operations are executed on the Event Dispatch Thread (EDT). This is essential for thread safety when working with Swing components.

Without using `SwingUtilities.invokeLater()`, there is a risk of race conditions and unpredictable behavior when the GUI is updated by multiple threads.


###EXPLANATION OF PROGRAM MAINFRAME

This program demonstrates the use of JPanel in Java Swing, which acts as a container to hold and manage other components using a layout manager. Here's a summary:

Frame Setup:

A JFrame is created with a BorderLayout (with 10px horizontal and 5px vertical gaps).
The frame's title, size, and default close operation are set.
Panel Creation:

A JPanel is created and its layout is set to FlowLayout (center-aligned with custom gaps).
The panel's background is set to red, and it takes the space defined by the layout.
Three buttons ("Button 1", "Button 2", "Button 3") are added to the panel.
Panel Size:

A preferred size (250x250) is specified for the panel. However, this is overridden if the panel is added to the center of the frame using BorderLayout.CENTER.
Panel in Frame:

The panel is added to the frame at the center. You can position it elsewhere (e.g., NORTH, SOUTH) using the BorderLayout regions.
Execution:

The show() method makes the frame visible.

###EXPLANATION OF PROGRAM MAINWINDOW

This program demonstrates a basic Java Swing application that creates a simple window using **JFrame**. Here's a summary:

1. **JFrame Initialization**: 
   - A `JFrame` object named `window` is created.
   - The title is set to `"Hello world"`.
   - The default close operation is set to `JFrame.DISPOSE_ON_CLOSE`, which ensures the window closes when the "X" button is clicked.

2. **Window Configuration**: 
   - The window's size is set to **800x600 pixels**.
   - `setLocationRelativeTo(null)` centers the window on the screen.

3. **Display the Window**: 
   - The `show()` method makes the window visible by calling `setVisible(true)`.

This is a simple example of setting up a basic Swing window with custom title, size, and centered positioning.

###EXPLANATION OF PROGRAM GRID LAYOUT

This program demonstrates the **GridLayout** layout manager in Java Swing, which arranges components in a grid-like structure. Here's a concise summary:

1. **JFrame Setup**:
   - A `JFrame` named `frame` is initialized with a title `"Grid_Layout Demo"`.
   - Default close operation, size (800x500), and centered positioning are set.

2. **GridLayout for JPanel**:
   - A `JPanel` is created with a **GridLayout** having 4 rows, 5 columns, and 10-pixel gaps both horizontally and vertically.
   - `JButton` components labeled "Button1" to "Button20" are added to the panel, filling the grid.

3. **Panel in Frame**:
   - The `JPanel` with the grid layout is added to the `JFrame`.
   - `frame.pack()` adjusts the frame size to fit the panel and its components snugly.

4. **Display**:
   - The `show()` method makes the frame visible.

This program showcases how to use **GridLayout** to create a neat grid-based arrangement of components in a Java Swing GUI.

###EXPLANATION OF PROGRAM FLOW LAYOUT

This program demonstrates the **FlowLayout** layout manager in Java Swing, which arranges components in a row and wraps them to the next line when space runs out. Here's a summary:

1. **JFrame Setup**:
   - A `JFrame` named `frame` is created with the title `"Flow_Layout Demo"`.
   - The frame uses a **BorderLayout**, with the panel added to the center (`BorderLayout.CENTER`).

2. **JPanel with FlowLayout**:
   - A `JPanel` is created with a **FlowLayout**, centered alignment, and horizontal and vertical gaps of 10 and 5 pixels, respectively.
   - The panel's background is set to **pink**.
   - Five `JButton` components labeled "Button1" to "Button5" are added to the panel. They are laid out in a single row and wrap to the next row if the frame is resized.

3. **Panel in Frame**:
   - The `JPanel` is added to the center of the frame, which allows the panel to resize dynamically with the frame.

4. **Display**:
   - The `show()` method makes the frame visible.

This program illustrates how to use **FlowLayout** for dynamic, row-wise component arrangement and how it integrates with the `BorderLayout` of a frame.

###EXPLANATION OF PROGRAM BORDER LAYOUT

This program demonstrates the **BorderLayout** layout manager in Java Swing, which divides a container into five regions: **NORTH, SOUTH, WEST, EAST, and CENTER**. Here's a summary:

1. **JFrame Setup**:
   - A `JFrame` named `frame` is created with the title `"BorderPane Demo"`.
   - The frame's default layout is **BorderLayout**, explicitly set with horizontal and vertical gaps of 5 pixels.

2. **Adding Components**:
   - Buttons labeled `"NORTH"`, `"SOUTH"`, `"WEST"`, `"EAST"`, and `"CENTER"` are added to their respective regions using `BorderLayout` constants.
   - Each region can hold only one component. If no region is specified, the component is placed in the **CENTER** by default.

3. **Behavior**:
   - Components resize dynamically based on their region:
     - **NORTH and SOUTH**: Resize horizontally.
     - **WEST and EAST**: Resize vertically.
     - **CENTER**: Fills the remaining space.

4. **Display**:
   - The `show()` method makes the frame visible.

This program illustrates how to use **BorderLayout** for structured component arrangement in a Swing GUI.

###EXPLANATION OF PROGRAM JBUTTON

This program demonstrates the use and customization of a **JButton** in a Java Swing application. Here's a concise explanation:

1. **JFrame and JPanel**:
   - A `JFrame` is created with the title `"JButton Demo"` and a default close operation.
   - A `JPanel` is added to the frame as a container for the button.

2. **Button Creation**:
   - A `JButton` is initialized with the label `"print"`.
   - An image icon (`print.jpg`) is added to the button, with an adjustable gap (`setIconTextGap`).

3. **Button Appearance**:
   - Font is set to **Arial, plain, size 16**.
   - Margins around the button text are adjusted using `Insets`.
   - The graphics and text positions on the button are customized (e.g., text at the bottom, centered horizontally).
   - The preferred size is explicitly set to **200x75 pixels**.

4. **Button Behavior**:
   - A tooltip text (`setToolTipText`) is displayed when the button is hovered.
   - An `ActionListener` is attached to the button, printing `"print button clicked"` to the console when clicked.
   - The button can be programmatically clicked using `doClick()`.
   - Additional configurations allow enabling/disabling the button or changing key bindings (e.g., `Mnemonic`).

5. **Integration**:
   - The button is added to the panel, which is then placed in the center of the frame.

This program demonstrates how to customize a **JButton**'s appearance and behavior in a Swing application while integrating it into a GUI.

###EXPLANATION OF PROGRAM JLABEL

This program demonstrates the use of a **JLabel** in a Java Swing application. It shows how to display text, images, and handle dynamic updates to a label's content. Here's a concise summary:

---

### **1. JFrame and JPanel Setup**:
- A `JFrame` titled `"JLabel Demo"` is created with default settings and a green `JPanel` added to the **NORTH** region.
- The panel uses a border for spacing (`BorderFactory.createEmptyBorder`).

---

### **2. JLabel Customization**:
- A `JLabel` is initialized with text `"My Cool App"`.
- **Appearance**:
  - Text color is set to **white**.
  - Font is set to **Sans-serif, bold, size 50**.
- **Image and Text**:
  - An image (`print1.png`) is added to the label.
  - Gap between text and image is adjusted (`setIconTextGap(10)`).
  - Image is positioned above the text (text centered horizontally, below the image).

---

### **3. JButton Functionality**:
- A `JButton` labeled `"update label text"` is added to the **SOUTH** region of the frame.
- When the button is clicked:
  - The label's text updates to a **multi-line format** using HTML (`<html>My Cool App <br> Buy it now</html>`).

---

### **4. Key Features Demonstrated**:
- **JLabel**:
  - Displaying styled text and images together.
  - Adjusting text and image alignment, gap, and formatting.
- **JButton**:
  - Adding an `ActionListener` for dynamic interaction.

---

This program showcases how to effectively use **JLabel** for visual displays and update it dynamically based on user interaction in a Swing GUI.

###EXPLANATION OF PROGRAM JTEXT_FIELD

This program demonstrates the use of a **JTextField** in a Java Swing application, which allows the user to input and edit a single line of text. Here’s a concise summary:

---

### **1. JFrame and JPanel Setup**:
- A `JFrame` titled `"JTextField Demo"` is created with default close operation and centered on the screen.
- A `JPanel` is added to the center of the frame with a `FlowLayout` and padding around the edges.

---

### **2. JTextField Customization**:
- A `JTextField` is created with a width of **10 columns**.
- **Appearance**:
  - Font: **Arial, bold, size 25**.
  - Text color: **red**.
  - Background color: **yellow**.
  - Tooltip: Displays `"enter some text"` when hovered over.
  - Margin: Adds padding around the text inside the field.

---

### **3. Dynamic Behavior**:
- An **ActionListener** is added to the `JTextField`, triggered when the "Enter" key is pressed:
  - The text entered in the `JTextField` is displayed on a `JLabel` added to the panel.
  - The `JTextField` is reset to display `"enter more text"` after submission.

---

### **4. JLabel**:
- A `JLabel` is added to display the submitted text dynamically.
- Font: **Arial, bold, size 25**.

---

### **5. Key Features Demonstrated**:
- **JTextField**:
  - Text entry with customizable appearance and tooltip.
  - Action handling for user input submission.
- **JLabel**:
  - Dynamic updates based on `JTextField` input.

---

This program showcases how to integrate **JTextField** and **JLabel** to create a simple interactive GUI for text entry and display.

###EXPLANATION OF PROGRAM JACTION_LISTENER

This program demonstrates the use of the **ActionListener** interface in a Java Swing application to handle action events like button clicks. Here's a summarized explanation:

---

### **1. JFrame and JPanel Setup**:
- A `JFrame` titled **"Action listener Demo"** is created with default settings and a central `JPanel` using the **FlowLayout** layout manager.
- The panel contains a `JLabel`, a `JTextField`, and a `JButton`.

---

### **2. ActionListener Implementation**:
- The main class (`Action_Listener`) implements the `ActionListener` interface.
- The `actionPerformed` method is overridden to define the behavior when the button is clicked:
  - It retrieves and prints the text entered in the `JTextField` to the console.

---

### **3. Adding ActionListener**:
- **Two methods** of adding an `ActionListener` are explained:
  1. **Anonymous Inner Class**: Directly attaching the `ActionListener` implementation when adding the listener to the button (commented out in the code).
  2. **Class as Listener**: The main class itself implements `ActionListener`. 
     - The `addActionListener(this)` call registers the current class as the listener for the button's click event.

---

### **4. Key Components**:
- **JLabel**: Displays static text `"enter your name"`.
- **JTextField**: Allows the user to enter their name (20 columns wide).
- **JButton**: Labeled `"save"`, which triggers the event when clicked.

---

### **5. Key Features Demonstrated**:
- How to use the **ActionListener** interface to respond to button clicks.
- Different methods for adding event listeners to Swing components.
- Interaction between `JTextField` and `JButton` to capture and display input.

---

This program provides a simple and clear demonstration of handling **action events** in Swing applications using both direct and class-based listener implementations.

###EXPLANATION OF PROGRAM JMENU

This program demonstrates how to create a menu bar with **JMenu** and **JMenuItem** in a Java Swing application. Here’s a summarized explanation:

---

### **1. JFrame and Menu Setup**:
- A `JFrame` titled **"JMenu Demo"** is created with default settings and a **BorderLayout**.
- A `JMenuBar` is created to hold the menus, and a `JMenu` titled **"File"** is added to the menu bar.

---

### **2. Adding Menu Items**:
- Three menu items are added to the **File** menu:
  1. **New**: Contains an icon and an accelerator (`Ctrl + N`).
  2. **Save**: Contains an icon and an accelerator (`Ctrl + S`).
  3. **Exit**: Contains an icon and an accelerator (`Ctrl + X`).
  
- **Sub-menu** and other components like `JCheckBoxMenuItem` and `JRadioButtonMenuItem` are also added to the File menu.
- **Separators** are used to organize the menu items.

---

### **3. Using Mnemonics and Accelerators**:
- **Mnemonics** (e.g., `VK_F` for "File") are used to make menu items accessible via keyboard shortcuts (e.g., pressing **Alt + F** to open the File menu).
- **Accelerators** allow users to trigger actions with keyboard shortcuts (e.g., **Ctrl + N** to trigger the "New" menu item).

---

### **4. ActionListener for Menu Items**:
- The program implements the **ActionListener** interface to handle actions when a menu item is selected.
- **actionPerformed** method checks the source of the event and prints the menu item’s text when clicked.

---

### **5. UI Customization**:
- Font size for the menu and menu items is customized using `UIManager`.
- Graphics are added next to menu items using `ImageIcon`.

---

### **6. Final Setup**:
- The `menuBar` is added to the `JFrame` using `setJMenuBar`, and the window is made visible.

---

This program demonstrates creating a **menu bar** with customizable **menu items**, **accelerators**, **mnemonics**, and handling **menu item actions** in a Java Swing application.


###EXPLANATION OF PROGRAM JPASSWORD

This Java Swing program demonstrates the use of a **JPasswordField**, which is a type of text field designed for entering passwords. Here's a summarized explanation:

---

### **1. JFrame Setup**:
- A `JFrame` is created with the title **"JPassword Field Demo"** and default close operation.
- The frame is sized at **500x300** pixels and centered on the screen.
  
---

### **2. Layout and Components**:
- The frame uses a **FlowLayout** with left alignment and custom horizontal and vertical gaps for better spacing.
- A **JLabel** with the text "enter password" is added to prompt the user for password input.
- A **JPasswordField** is created to allow users to enter a password. It is configured with a field width of 10 characters and an **echo character** (`#`) to mask the input (instead of the default asterisk `*`).

---

### **3. Password Handling**:
- A **JButton** labeled "check" is added. When clicked, it triggers the `actionPerformed` method.
- The password entered by the user is retrieved using `passwordField.getPassword()`, which returns a `char[]` array.
- The password is then converted into a `String` and printed to the console.

---

### **4. Final Setup**:
- The components (label, password field, button) are added to the frame.
- The frame is made visible when the `show()` method is called.

---

This program demonstrates creating a **password input field** in a Swing application, masking the input, and handling the password retrieval with a button click.

###EXPLANATION OF PROGRAM JCHECKBOX

This Java Swing program demonstrates the use of a **JCheckBox**. Here's a summarized explanation:

---

### **1. JFrame Setup**:
- A `JFrame` is created with the title **"JCheckBox Demo"**, and its default close operation is set to dispose of the frame when closed.
- The frame's size is set to **800x500** pixels and it's centered on the screen.

---

### **2. Font Customization**:
- The font for menu and checkbox items is customized to **"sans-serif"**, with a font size of **18**.

---

### **3. JCheckBox Creation**:
- A **JCheckBox** is created with the label **"Checkbox"**.
- The text of the checkbox is printed to the console using `System.out.println(checkBox.getText())`.
- A **mnemonic** (`KeyEvent.VK_C`) is set for the checkbox, which allows the user to select or deselect the checkbox by pressing the **C** key on the keyboard (the **C** in "Checkbox" is underlined, indicating the mnemonic).

---

### **4. Panel and Frame**:
- The checkbox is added to a `JPanel`, and the panel is then added to the frame.

---

### **5. Final Setup**:
- The `show()` method makes the frame visible when called.

---

This program demonstrates creating a **checkbox** in a Java Swing application with keyboard accessibility through the use of a **mnemonic**. The program also customizes the checkbox's font and layout.
