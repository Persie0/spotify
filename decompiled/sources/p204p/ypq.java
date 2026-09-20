package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ypq {

    /* JADX INFO: renamed from: a */
    public final ArrayList f275003a;

    /* JADX INFO: renamed from: b */
    public final char f275004b;

    /* JADX INFO: renamed from: c */
    public final int f275005c;

    /* JADX INFO: renamed from: d */
    public final boolean f275006d;

    /* JADX INFO: renamed from: e */
    public final boolean f275007e;

    /* JADX INFO: renamed from: f */
    public ypq f275008f;

    /* JADX INFO: renamed from: g */
    public ypq f275009g;

    public ypq(ArrayList arrayList, char c, boolean z, boolean z2, ypq ypqVar) {
        this.f275003a = arrayList;
        this.f275004b = c;
        this.f275006d = z;
        this.f275007e = z2;
        this.f275008f = ypqVar;
        this.f275005c = arrayList.size();
    }

    /* JADX INFO: renamed from: a */
    public final List m94310a(int i) {
        ArrayList arrayList = this.f275003a;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException(s571.m77247f(arrayList.size(), "length must be between 1 and ", i, ", was "));
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: b */
    public final List m94311b(int i) {
        ArrayList arrayList = this.f275003a;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException(s571.m77247f(arrayList.size(), "length must be between 1 and ", i, ", was "));
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }
}
