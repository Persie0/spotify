package p204p;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes3.dex */
public final class y500 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final int f269287a;

    /* JADX INFO: renamed from: b */
    public FragmentContainerView f269288b;

    public y500(int i) {
        this.f269287a = i;
    }

    /* JADX INFO: renamed from: a */
    public final FragmentContainerView m92824a() {
        FragmentContainerView fragmentContainerView = this.f269288b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(klh.m56832d(this.f269287a, " yet", new StringBuilder("AndroidView has not created a container for ")).toString());
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.f269287a);
        this.f269288b = fragmentContainerView;
        return fragmentContainerView;
    }
}
