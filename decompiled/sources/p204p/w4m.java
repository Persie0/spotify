package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public interface w4m extends lbz0 {
    /* JADX INFO: renamed from: a */
    Single mo41413a(List list);

    /* JADX INFO: renamed from: e */
    default List mo41416e(List list) {
        return Collections.singletonList(rv50.f202999a);
    }

    /* JADX INFO: renamed from: i */
    default Set mo41417i() {
        return bk5.m29624m1(new s2c[]{s2c.MOST_PLAYED_SONGS, s2c.SOCIAL_RECOMMENDATIONS});
    }

    /* JADX INFO: renamed from: j */
    int mo41418j();

    /* JADX INFO: renamed from: k */
    Single mo41419k(List list);

    /* JADX INFO: renamed from: m */
    default boolean mo82482m() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    default List mo41420l(List list) {
        return list;
    }
}
