// Generated code from Butter Knife. Do not modify!
package umn.ac.modul14;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Tambah_ViewBinding implements Unbinder {
  private Tambah target;

  private View view7f09004d;

  @UiThread
  public Tambah_ViewBinding(Tambah target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Tambah_ViewBinding(final Tambah target, View source) {
    this.target = target;

    View view;
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radio_jk, "field 'radioGroup'", RadioGroup.class);
    target.rbMale = Utils.findRequiredViewAsType(source, R.id.rb_male, "field 'rbMale'", RadioButton.class);
    target.rbFemale = Utils.findRequiredViewAsType(source, R.id.rb_female, "field 'rbFemale'", RadioButton.class);
    target.spinJurusan = Utils.findRequiredViewAsType(source, R.id.spinJurusan, "field 'spinJurusan'", Spinner.class);
    target.edtNama = Utils.findRequiredViewAsType(source, R.id.edtNama, "field 'edtNama'", EditText.class);
    target.edtNIM = Utils.findRequiredViewAsType(source, R.id.edtNIM, "field 'edtNIM'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnTambah, "method 'tambah'");
    view7f09004d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tambah();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Tambah target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.radioGroup = null;
    target.rbMale = null;
    target.rbFemale = null;
    target.spinJurusan = null;
    target.edtNama = null;
    target.edtNIM = null;

    view7f09004d.setOnClickListener(null);
    view7f09004d = null;
  }
}
