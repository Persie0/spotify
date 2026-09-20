package p204p;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

/* JADX INFO: loaded from: classes7.dex */
public final class lh10 {

    /* JADX INFO: renamed from: a */
    public final rb5 f133339a;

    /* JADX INFO: renamed from: b */
    public final eh10 f133340b;

    public lh10(Context context, ih10 ih10Var) {
        eh10 eh10Var = new eh10(context, ih10Var.f102122j);
        this.f133340b = eh10Var;
        rb5 rb5Var = new rb5(eh10Var, 21);
        this.f133339a = rb5Var;
        eh10Var.setCancelable(ih10Var.f102117e);
        eh10Var.setOnCancelListener(ih10Var.f102118f);
        eh10Var.setOnDismissListener(ih10Var.f102119g);
        if (TextUtils.isEmpty(ih10Var.f102113a)) {
            eh10Var.m38890b(false);
        } else {
            rb5Var.f197472c = ih10Var.f102115c;
            eh10Var.m38890b(true);
        }
        if (TextUtils.isEmpty(ih10Var.f102114b)) {
            eh10Var.m38889a(false);
        } else {
            rb5Var.f197473d = ih10Var.f102116d;
            eh10Var.m38889a(true);
        }
        eh10Var.f59449d = (mh10) vie1.m85630l(ih10Var.f102120h, eh10.f59445f);
        CharSequence charSequence = ih10Var.f102113a;
        final int i = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: p.kh10

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ lh10 f122498b;

            {
                this.f122498b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        rb5 rb5Var2 = this.f122498b.f133339a;
                        eh10 eh10Var2 = (eh10) rb5Var2.f197471b;
                        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) rb5Var2.f197472c;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(eh10Var2, -1);
                        }
                        eh10Var2.dismiss();
                        break;
                    default:
                        rb5 rb5Var3 = this.f122498b.f133339a;
                        eh10 eh10Var3 = (eh10) rb5Var3.f197471b;
                        DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) rb5Var3.f197473d;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(eh10Var3, -2);
                        }
                        eh10Var3.dismiss();
                        break;
                }
            }
        };
        Button button = eh10Var.f59447b;
        button.setText(charSequence);
        button.setOnClickListener(onClickListener);
        if (!TextUtils.isEmpty(charSequence)) {
            button.setVisibility(0);
        }
        CharSequence charSequence2 = ih10Var.f102114b;
        final int i2 = 1;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: p.kh10

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ lh10 f122498b;

            {
                this.f122498b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        rb5 rb5Var2 = this.f122498b.f133339a;
                        eh10 eh10Var2 = (eh10) rb5Var2.f197471b;
                        DialogInterface.OnClickListener onClickListener3 = (DialogInterface.OnClickListener) rb5Var2.f197472c;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(eh10Var2, -1);
                        }
                        eh10Var2.dismiss();
                        break;
                    default:
                        rb5 rb5Var3 = this.f122498b.f133339a;
                        eh10 eh10Var3 = (eh10) rb5Var3.f197471b;
                        DialogInterface.OnClickListener onClickListener4 = (DialogInterface.OnClickListener) rb5Var3.f197473d;
                        if (onClickListener4 != null) {
                            onClickListener4.onClick(eh10Var3, -2);
                        }
                        eh10Var3.dismiss();
                        break;
                }
            }
        };
        Button button2 = eh10Var.f59448c;
        button2.setText(charSequence2);
        button2.setOnClickListener(onClickListener2);
        if (TextUtils.isEmpty(charSequence2)) {
            return;
        }
        button2.setVisibility(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m58941a() {
        ((eh10) this.f133339a.f197471b).dismiss();
    }

    /* JADX INFO: renamed from: b */
    public final void m58942b() {
        ((eh10) this.f133339a.f197471b).show();
    }
}
