package p204p;

import android.view.View;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplayingqueue.bottomsheet.view.JamHeaderContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class rq70 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final QueueInteractionLayout f201761a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f201762b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f201763c;

    /* JADX INFO: renamed from: d */
    public final JamHeaderContainerView f201764d;

    /* JADX INFO: renamed from: e */
    public final ComposeView f201765e;

    public rq70(rq70 rq70Var) {
        this.f201761a = rq70Var.f201761a;
        this.f201762b = rq70Var.f201762b;
        this.f201763c = rq70Var.f201763c;
        this.f201764d = rq70Var.f201764d;
        this.f201765e = rq70Var.f201765e;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return this.f201761a;
    }

    public rq70(QueueInteractionLayout queueInteractionLayout, JamHeaderContainerView jamHeaderContainerView, ConstraintLayout constraintLayout, ComposeView composeView, RecyclerView recyclerView) {
        this.f201761a = queueInteractionLayout;
        this.f201764d = jamHeaderContainerView;
        this.f201762b = constraintLayout;
        this.f201765e = composeView;
        this.f201763c = recyclerView;
    }
}
