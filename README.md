# Android coding conventions

## 1.2 File naming

### 1.2.1 Class files

Classes should be named using __UpperCamelCase__.

All classes that extend an Android component should end with the name of the component.
For example: `MainActivity`, `ProfileFragment`, `DownloadService`, `ConfirmCodeDialog`.

### 1.2.2 Drawable files

Drawables' naming convention

| Type       | Prefix    | Example            |
|------------|-----------|--------------------|
| Button     | btn_      | btn_login_normal   |
| Dialog     | dialog_   | dialog_bottom      |
| Circle     | circle_   | circle_black       |
| Divider    | divider_  | divider_green      |
| Progress   | progress_ | progress_circle    |
| Tabs       | tab_      | tab_selected       |

Icons' naming convention

| Type            | Prefix      | Example             |
| ----------------|-------------|---------------------|
| Icons           | ic_         | ic_back.png         |
| Launcher icons  | ic_launcher | ic_launcher_round   |
| Menu icons      | ic_menu     | ic_menu_main        |
| Tab icons       | ic_tab      | ic_tab_profile      |
| Dialog icons    | ic_dialog   | ic_dialog_error     |

Selector states' naming convention

| State    | Suffix    | Example             |
|----------|-----------|---------------------|
| Normal   | _normal   | btn_send_normal     |
| Pressed  | _pressed  | btn_send_pressed    |
| Focused  | _focused  | btn_send_focused    |
| Disabled | _disabled | btn_send_disabled   |
| Selected | _selected | btn_send_selected   |
