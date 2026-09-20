package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class a5p implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12575a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ j5p f12576b;

    public /* synthetic */ a5p(j5p j5pVar, int i) {
        this.f12575a = i;
        this.f12576b = j5pVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        c7i c7iVar;
        switch (this.f12575a) {
            case 0:
                j5p j5pVar = this.f12576b;
                d7i d7iVar = j5pVar.f109050a1;
                if (d7iVar == null) {
                    c7iVar = null;
                } else {
                    if (d7iVar == null) {
                        wj50.m88260d0("model");
                        throw null;
                    }
                    c7iVar = d7iVar.f46219t;
                }
                boolean z = (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true;
                if (c7iVar == null || !z) {
                    return;
                }
                j5pVar.m52470r(c7iVar);
                d7i d7iVar2 = j5pVar.f109050a1;
                if (d7iVar2 != null) {
                    j5pVar.m52471t(d7iVar2.f46201b);
                    return;
                } else {
                    wj50.m88260d0("model");
                    throw null;
                }
            default:
                view.removeOnLayoutChangeListener(this);
                j5p.m52461a(this.f12576b);
                return;
        }
    }
}
