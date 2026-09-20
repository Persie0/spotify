package p204p;

import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class nqw0 implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uqw0 f157348a;

    public nqw0(uqw0 uqw0Var) {
        this.f157348a = uqw0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        dhr0 ahr0Var;
        uqw0 uqw0Var = this.f157348a;
        Consumer consumer = uqw0Var.f233140b;
        mqw0 mqw0Var = uqw0Var.f233139a;
        if (i == ((MaterialRadioButton) mqw0Var.f146375i).getId()) {
            ahr0Var = zgr0.f282699a;
        } else if (i == ((MaterialRadioButton) mqw0Var.f146374h).getId()) {
            ahr0Var = chr0.f38071a;
        } else {
            ahr0Var = i == ((MaterialRadioButton) mqw0Var.f146373g).getId() ? new ahr0("") : bhr0.f27231a;
        }
        consumer.accept(new kpw0(ahr0Var));
    }
}
