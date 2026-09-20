package p204p;

import android.util.SparseArray;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class aj30 {
    private static final uh00 GET_ID = new zi30(0);
    private static final uh00 GET_BINDER_ID = new zi30(1);

    private aj30() {
    }

    public static <T extends Enum<T> & yi30> et70 asLazySparseArray(Class<T> cls) {
        return new et70(new yaz(cls, 10));
    }

    public static <T extends Enum<T> & yi30> gt30 asRegistry(Class<T> cls) {
        drw drwVar = new drw();
        drwVar.m36743f(asSparseArray(cls));
        return new gt30((SparseArray) drwVar.f52400b);
    }

    public static <T extends Enum<T> & yi30> SparseArray<qj30> asSparseArray(Class<T> cls) {
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        SparseArray<qj30> sparseArray = new SparseArray<>(objArr.length);
        for (Object obj : objArr) {
            nj30 nj30Var = (nj30) ((yi30) obj);
            nj30Var.getClass();
            sparseArray.put(R.id.hub_common_loading_view, nj30Var.f154433b);
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static uh00 getBinderId() {
        return GET_BINDER_ID;
    }

    public static uh00 getId() {
        return GET_ID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String lambda$static$0(bk30 bk30Var) {
        bk30Var.getClass();
        return bk30Var.mo29575id();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer lambda$static$1(yi30 yi30Var) {
        yi30Var.getClass();
        return Integer.valueOf(R.id.hub_common_loading_view);
    }

    public static <T extends Enum<T> & bk30 & yi30> lk30 makeResolver(Class<T> cls) {
        return new u6x(new n95((Class) cls, getId()), 19);
    }
}
