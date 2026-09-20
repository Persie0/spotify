package p204p;

import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: classes10.dex */
public final class qnr0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f190687a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f190688b;

    /* JADX INFO: renamed from: c */
    public final EditText f190689c;

    /* JADX INFO: renamed from: d */
    public final View f190690d;

    /* JADX INFO: renamed from: e */
    public final EncoreButton f190691e;

    /* JADX INFO: renamed from: f */
    public final EncoreTextView f190692f;

    public qnr0(ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EditText editText, View view, EncoreButton encoreButton, EncoreTextView encoreTextView2) {
        this.f190687a = constraintLayout;
        this.f190688b = encoreTextView;
        this.f190689c = editText;
        this.f190690d = view;
        this.f190691e = encoreButton;
        this.f190692f = encoreTextView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f190687a;
    }
}
