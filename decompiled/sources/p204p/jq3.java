package p204p;

import android.view.ViewGroup;
import android.widget.Space;

/* JADX INFO: loaded from: classes.dex */
public final class jq3 extends hjv0 {
    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return 1;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ void mo1619n(int i, dkv0 dkv0Var) {
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(0, 1));
        return new kq3(space);
    }
}
