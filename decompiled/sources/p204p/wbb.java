package p204p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public final class wbb extends xbb {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f249728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbb(Field field, boolean z, boolean z2, int i) {
        super(field, z, z2);
        this.f249728g = i;
    }

    @Override // p204p.xbb, p204p.ccb
    /* JADX INFO: renamed from: a */
    public void mo32239a(Object[] objArr) {
        switch (this.f249728g) {
            case 1:
                super.mo32239a(objArr);
                m32240b(bk5.m29584G0(objArr));
                break;
            default:
                super.mo32239a(objArr);
                break;
        }
    }
}
