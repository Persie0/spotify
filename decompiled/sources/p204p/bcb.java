package p204p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public final class bcb extends xbb {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcb(Method method, int i) {
        super(method, false, 6);
        this.f25821g = i;
    }

    @Override // p204p.xbb, p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        switch (this.f25821g) {
            case 0:
                mo32239a(objArr);
                return m90313c(objArr.length <= 1 ? new Object[0] : bk5.m29640y0(1, objArr.length, objArr), objArr[0]);
            case 1:
                mo32239a(objArr);
                m32240b(bk5.m29584G0(objArr));
                return m90313c(objArr.length <= 1 ? new Object[0] : bk5.m29640y0(1, objArr.length, objArr), null);
            default:
                mo32239a(objArr);
                return m90313c(objArr, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bcb(Method method, boolean z, int i) {
        super(method, z, i);
        this.f25821g = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcb(Method method) {
        super(method, true, 4);
        this.f25821g = 1;
    }
}
