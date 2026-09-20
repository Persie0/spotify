package p204p;

import android.view.View;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.card.EncoreCard;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class oe1 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164312a;

    /* JADX INFO: renamed from: b */
    public final EncoreCard f164313b;

    /* JADX INFO: renamed from: c */
    public final EncoreButton f164314c;

    /* JADX INFO: renamed from: d */
    public final EncoreTextView f164315d;

    /* JADX INFO: renamed from: e */
    public final EncoreTextView f164316e;

    public /* synthetic */ oe1(EncoreCard encoreCard, EncoreButton encoreButton, EncoreTextView encoreTextView, EncoreTextView encoreTextView2, int i) {
        this.f164312a = i;
        this.f164313b = encoreCard;
        this.f164314c = encoreButton;
        this.f164315d = encoreTextView;
        this.f164316e = encoreTextView2;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f164312a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f164313b;
    }
}
