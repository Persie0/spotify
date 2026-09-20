package p204p;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class ftx0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73341a = 0;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f73342b;

    /* JADX INFO: renamed from: c */
    public final TextView f73343c;

    /* JADX INFO: renamed from: d */
    public final TextView f73344d;

    public ftx0(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f73342b = constraintLayout;
        this.f73343c = textView;
        this.f73344d = textView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f73341a) {
            case 0:
                break;
        }
        return this.f73342b;
    }

    public ftx0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f73342b = constraintLayout;
        this.f73343c = textView;
        this.f73344d = textView2;
    }
}
