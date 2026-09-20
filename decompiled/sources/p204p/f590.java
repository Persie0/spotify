package p204p;

import com.spotify.listplatform.sortingimpl.ListSortingProto$ListSortingStore;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class f590 implements guz0 {

    /* JADX INFO: renamed from: a */
    public static final f590 f65983a = new f590();

    /* JADX INFO: renamed from: b */
    public static final ListSortingProto$ListSortingStore f65984b = ListSortingProto$ListSortingStore.m13012o();

    @Override // p204p.guz0
    /* JADX INFO: renamed from: a */
    public final Object mo30659a() {
        return f65984b;
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: d */
    public final Object mo30660d(FileInputStream fileInputStream) {
        return ListSortingProto$ListSortingStore.m13013q(fileInputStream);
    }

    @Override // p204p.guz0
    /* JADX INFO: renamed from: e */
    public final void mo30661e(Object obj, pg21 pg21Var) {
        ((ListSortingProto$ListSortingStore) obj).writeTo(pg21Var);
    }
}
