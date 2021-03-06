/*
 * This file is part of Yari Editor.
 *
 *  Yari Editor is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 *  Yari Editor is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with Yari Editor. If not, see <http://www.gnu.org/licenses/>.
 */

package components;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.testfx.assertions.api.Assertions.assertThat;

public class DialogTest extends ApplicationTest {

    Dialog dialog;

    @Override
    public void start(Stage stage) throws Exception {
        StackPane container = new StackPane();
        dialog = new Dialog(container);
        Scene scene = new Scene(container, 500,500);
        stage.setScene(scene);
        stage.show();
        dialog.show();
    }

    @Test
    public void setText() {

        String text = "This is some test content";
        assertThat(dialog).isVisible();
        dialog.setText(text);

        //pull the text area out using css selector
        TextArea textArea = lookup(".text-area").query();
        assertThat(textArea).hasText(text);

    }

}