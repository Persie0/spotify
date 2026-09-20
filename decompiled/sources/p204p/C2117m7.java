package p204p;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p.m7 */
/* JADX INFO: loaded from: classes11.dex */
public final class C2117m7 extends AbstractC2154n7 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140602a = 1;

    /* JADX INFO: renamed from: b */
    public int f140603b;

    /* JADX INFO: renamed from: c */
    public int f140604c;

    /* JADX INFO: renamed from: d */
    public final List f140605d;

    public C2117m7(List list) {
        this.f140605d = list;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        switch (this.f140602a) {
            case 0:
                break;
        }
        return this.f140604c;
    }

    /* JADX INFO: renamed from: b */
    public void m61037b(int i, int i2) {
        bga.m29093o(i, i2, this.f140605d.size());
        this.f140603b = i;
        this.f140604c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f140602a) {
            case 0:
                int i2 = this.f140604c;
                if (i < 0 || i >= i2) {
                    throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i2, ", size: "));
                }
                return ((AbstractC2154n7) this.f140605d).get(this.f140603b + i);
            default:
                int i3 = this.f140604c;
                if (i < 0 || i >= i3) {
                    throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", i3, ", size: "));
                }
                return this.f140605d.get(this.f140603b + i);
        }
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public List subList(int i, int i2) {
        switch (this.f140602a) {
            case 0:
                bga.m29093o(i, i2, this.f140604c);
                AbstractC2154n7 abstractC2154n7 = (AbstractC2154n7) this.f140605d;
                int i3 = this.f140603b;
                return new C2117m7(abstractC2154n7, i + i3, i3 + i2);
            default:
                return super.subList(i, i2);
        }
    }

    public C2117m7(AbstractC2154n7 abstractC2154n7, int i, int i2) {
        this.f140605d = abstractC2154n7;
        this.f140603b = i;
        bga.m29093o(i, i2, abstractC2154n7.mo33075a());
        this.f140604c = i2 - i;
    }
}
