package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class cke0 extends AbstractC2154n7 {

    /* JADX INFO: renamed from: a */
    public final List[] f38939a;

    /* JADX INFO: renamed from: b */
    public final int f38940b;

    public cke0(List... listArr) {
        this.f38939a = listArr;
        int size = 0;
        for (List list : listArr) {
            size += list.size();
        }
        this.f38940b = size;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f38940b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int size = i;
        for (List list : this.f38939a) {
            if (list.size() > size) {
                return list.get(size);
            }
            size -= list.size();
        }
        throw new IndexOutOfBoundsException(s571.m77246e(i, "Invalid index, "));
    }
}
