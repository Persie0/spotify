package p204p;

import android.view.View;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.puffin.setup.setupflow.p137ui.ErrorView;

/* JADX INFO: loaded from: classes10.dex */
public final class w8t0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final ErrorView f249009a;

    /* JADX INFO: renamed from: b */
    public final EncoreTextView f249010b;

    /* JADX INFO: renamed from: c */
    public final EncoreButton f249011c;

    /* JADX INFO: renamed from: d */
    public final EncoreButton f249012d;

    /* JADX INFO: renamed from: e */
    public final EncoreTextView f249013e;

    public w8t0(ErrorView errorView, EncoreTextView encoreTextView, EncoreButton encoreButton, EncoreButton encoreButton2, EncoreTextView encoreTextView2) {
        this.f249009a = errorView;
        this.f249010b = encoreTextView;
        this.f249011c = encoreButton;
        this.f249012d = encoreButton2;
        this.f249013e = encoreTextView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f249009a;
    }
}
