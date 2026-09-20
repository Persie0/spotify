package p204p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes10.dex */
public final class oev0 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164565a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f164566b;

    /* JADX INFO: renamed from: c */
    public final EncoreButton f164567c;

    public /* synthetic */ oev0(ConstraintLayout constraintLayout, EncoreButton encoreButton, int i) {
        this.f164565a = i;
        this.f164566b = constraintLayout;
        this.f164567c = encoreButton;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f164565a) {
            case 0:
                break;
        }
        return this.f164566b;
    }
}
