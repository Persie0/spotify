package p204p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class eh10 extends Dialog {

    /* JADX INFO: renamed from: f */
    public static final dh10 f59445f = new dh10();

    /* JADX INFO: renamed from: a */
    public boolean f59446a;

    /* JADX INFO: renamed from: b */
    public final Button f59447b;

    /* JADX INFO: renamed from: c */
    public final Button f59448c;

    /* JADX INFO: renamed from: d */
    public mh10 f59449d;

    /* JADX INFO: renamed from: e */
    public final hh10 f59450e;

    public eh10(Context context, hh10 hh10Var) {
        super(context, R.style.Theme_Glue_Dialog_NoMinSize);
        this.f59449d = f59445f;
        this.f59450e = hh10Var;
        View viewInflate = getLayoutInflater().inflate(R.layout.glue_dialog, (ViewGroup) null);
        Button button = (Button) viewInflate.findViewById(R.id.button_positive);
        this.f59447b = button;
        Button button2 = (Button) viewInflate.findViewById(R.id.button_negative);
        this.f59448c = button2;
        i68.m49801b(button);
        i68.m49801b(button2);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.content);
        hh10Var.mo33335q(getLayoutInflater(), scrollView);
        int i = -hh10Var.mo33336r();
        if (scrollView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) scrollView.getLayoutParams()).bottomMargin = i;
        }
        setContentView(viewInflate);
    }

    /* JADX INFO: renamed from: a */
    public final void m38889a(boolean z) {
        this.f59448c.setVisibility(z ? 0 : 8);
        Button button = this.f59447b;
        if (z) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.glue_dialog_button_spacing);
            if (button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).bottomMargin = dimensionPixelSize;
                return;
            }
            return;
        }
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(R.dimen.single_positive_button_margin);
        if (button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).bottomMargin = dimensionPixelSize2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m38890b(boolean z) {
        this.f59447b.setVisibility(z ? 0 : 8);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f59446a) {
            return;
        }
        this.f59449d.mo35963b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59449d.mo35962a();
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        this.f59446a = true;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.f59450e.getClass();
    }
}
