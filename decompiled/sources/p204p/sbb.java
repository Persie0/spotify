package p204p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public final class sbb extends tbb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f207407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbb(Field field, boolean z, int i) {
        super(field, z);
        this.f207407e = i;
    }

    @Override // p204p.ccb
    /* JADX INFO: renamed from: a */
    public void mo32239a(Object[] objArr) {
        switch (this.f207407e) {
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
