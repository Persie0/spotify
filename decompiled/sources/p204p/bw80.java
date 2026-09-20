package p204p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$ListFilteringStore;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class bw80 implements guz0 {

    /* JADX INFO: renamed from: a */
    public static final bw80 f31582a = new bw80();

    /* JADX INFO: renamed from: b */
    public static final ListFilteringProto$ListFilteringStore f31583b = ListFilteringProto$ListFilteringStore.m13000n();

    @Override // p204p.guz0
    /* JADX INFO: renamed from: a */
    public final Object mo30659a() {
        return f31583b;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: d */
    public final Object mo30660d(FileInputStream fileInputStream) {
        return ListFilteringProto$ListFilteringStore.m13001p(fileInputStream);
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: e */
    public final void mo30661e(Object obj, pg21 pg21Var) {
        ((ListFilteringProto$ListFilteringStore) obj).writeTo(pg21Var);
    }
}
