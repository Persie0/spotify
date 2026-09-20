package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class meq extends dr81 {

    /* JADX INFO: renamed from: F0 */
    public static final meq f142797F0 = new meq(new leq());

    /* JADX INFO: renamed from: G0 */
    public static final String f142798G0;

    /* JADX INFO: renamed from: H0 */
    public static final String f142799H0;

    /* JADX INFO: renamed from: I0 */
    public static final String f142800I0;

    /* JADX INFO: renamed from: J0 */
    public static final String f142801J0;

    /* JADX INFO: renamed from: K0 */
    public static final String f142802K0;

    /* JADX INFO: renamed from: L0 */
    public static final String f142803L0;

    /* JADX INFO: renamed from: M0 */
    public static final String f142804M0;

    /* JADX INFO: renamed from: N0 */
    public static final String f142805N0;

    /* JADX INFO: renamed from: O0 */
    public static final String f142806O0;

    /* JADX INFO: renamed from: P0 */
    public static final String f142807P0;

    /* JADX INFO: renamed from: Q0 */
    public static final String f142808Q0;

    /* JADX INFO: renamed from: R0 */
    public static final String f142809R0;

    /* JADX INFO: renamed from: S0 */
    public static final String f142810S0;

    /* JADX INFO: renamed from: T0 */
    public static final String f142811T0;

    /* JADX INFO: renamed from: U0 */
    public static final String f142812U0;

    /* JADX INFO: renamed from: V0 */
    public static final String f142813V0;

    /* JADX INFO: renamed from: W0 */
    public static final String f142814W0;

    /* JADX INFO: renamed from: X0 */
    public static final String f142815X0;

    /* JADX INFO: renamed from: Y0 */
    public static final String f142816Y0;

    /* JADX INFO: renamed from: A0 */
    public final boolean f142817A0;

    /* JADX INFO: renamed from: B0 */
    public final boolean f142818B0;

    /* JADX INFO: renamed from: C0 */
    public final boolean f142819C0;

    /* JADX INFO: renamed from: D0 */
    public final SparseArray f142820D0;

    /* JADX INFO: renamed from: E0 */
    public final SparseBooleanArray f142821E0;

    /* JADX INFO: renamed from: w0 */
    public final boolean f142822w0;

    /* JADX INFO: renamed from: x0 */
    public final boolean f142823x0;

    /* JADX INFO: renamed from: y0 */
    public final boolean f142824y0;

    /* JADX INFO: renamed from: z0 */
    public final boolean f142825z0;

    static {
        String str = h0b1.f86200a;
        f142798G0 = Integer.toString(1000, 36);
        f142799H0 = Integer.toString(1001, 36);
        f142800I0 = Integer.toString(1002, 36);
        f142801J0 = Integer.toString(1003, 36);
        f142802K0 = Integer.toString(1004, 36);
        f142803L0 = Integer.toString(1005, 36);
        f142804M0 = Integer.toString(1006, 36);
        f142805N0 = Integer.toString(1007, 36);
        f142806O0 = Integer.toString(1008, 36);
        f142807P0 = Integer.toString(1009, 36);
        f142808Q0 = Integer.toString(ContentMediaFormat.EXTRA_GENERIC, 36);
        f142809R0 = Integer.toString(CollectionItemdata$ItemData.YL_FILTER_ITEM_DATA_FIELD_NUMBER, 36);
        f142810S0 = Integer.toString(ContentMediaFormat.EXTRA_EPISODE, 36);
        f142811T0 = Integer.toString(ContentMediaFormat.EXTRA_MOVIE, 36);
        f142812U0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_PODCAST, 36);
        f142813V0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_PODCAST, 36);
        f142814W0 = Integer.toString(1016, 36);
        f142815X0 = Integer.toString(1017, 36);
        f142816Y0 = Integer.toString(1018, 36);
    }

    public meq(leq leqVar) {
        super(leqVar);
        this.f142822w0 = leqVar.f132655J;
        this.f142823x0 = leqVar.f132656K;
        this.f142824y0 = leqVar.f132657L;
        this.f142825z0 = leqVar.f132658M;
        this.f142817A0 = leqVar.f132659N;
        this.f142818B0 = leqVar.f132660O;
        this.f142819C0 = leqVar.f132661P;
        this.f142820D0 = leqVar.f132662Q;
        this.f142821E0 = leqVar.f132663R;
    }

    @Override // p204p.dr81
    /* JADX INFO: renamed from: a */
    public final cr81 mo36707a() {
        return new leq(this);
    }

    @Override // p204p.dr81
    /* JADX INFO: renamed from: c */
    public final Bundle mo36708c() {
        Bundle bundleMo36708c = super.mo36708c();
        bundleMo36708c.putBoolean(f142798G0, this.f142822w0);
        bundleMo36708c.putBoolean(f142799H0, false);
        bundleMo36708c.putBoolean(f142800I0, this.f142823x0);
        bundleMo36708c.putBoolean(f142812U0, false);
        bundleMo36708c.putBoolean(f142801J0, this.f142824y0);
        bundleMo36708c.putBoolean(f142802K0, false);
        bundleMo36708c.putBoolean(f142803L0, false);
        bundleMo36708c.putBoolean(f142804M0, false);
        bundleMo36708c.putBoolean(f142813V0, false);
        bundleMo36708c.putBoolean(f142816Y0, this.f142825z0);
        bundleMo36708c.putBoolean(f142814W0, this.f142817A0);
        bundleMo36708c.putBoolean(f142805N0, this.f142818B0);
        bundleMo36708c.putBoolean(f142806O0, false);
        bundleMo36708c.putBoolean(f142807P0, this.f142819C0);
        bundleMo36708c.putBoolean(f142815X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.f142820D0;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.f142821E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                bundleMo36708c.putIntArray(f142811T0, iArr);
                return bundleMo36708c;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((lf81) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleMo36708c.putIntArray(f142808Q0, k0e1.m54979N(arrayList));
            bundleMo36708c.putParcelableArrayList(f142809R0, hra.m48351D(arrayList2, new qg9(4)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                ikc0.m50942n(sparseArray.valueAt(0));
                throw null;
            }
            bundleMo36708c.putSparseParcelableArray(f142810S0, sparseArray3);
            i++;
        }
    }

    @Override // p204p.dr81
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && meq.class == obj.getClass()) {
            meq meqVar = (meq) obj;
            if (super.equals(meqVar) && this.f142822w0 == meqVar.f142822w0 && this.f142823x0 == meqVar.f142823x0 && this.f142824y0 == meqVar.f142824y0 && this.f142825z0 == meqVar.f142825z0 && this.f142817A0 == meqVar.f142817A0 && this.f142818B0 == meqVar.f142818B0 && this.f142819C0 == meqVar.f142819C0) {
                SparseBooleanArray sparseBooleanArray = meqVar.f142821E0;
                SparseBooleanArray sparseBooleanArray2 = this.f142821E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = meqVar.f142820D0;
                    SparseArray sparseArray2 = this.f142820D0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        lf81 lf81Var = (lf81) entry.getKey();
                                        if (!map2.containsKey(lf81Var) || !Objects.equals(entry.getValue(), map2.get(lf81Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p204p.dr81
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f142822w0 ? 1 : 0)) * 961) + (this.f142823x0 ? 1 : 0)) * 961) + (this.f142824y0 ? 1 : 0)) * 28629151) + (this.f142825z0 ? 1 : 0)) * 31) + (this.f142817A0 ? 1 : 0)) * 31) + (this.f142818B0 ? 1 : 0)) * 961) + (this.f142819C0 ? 1 : 0)) * 31;
    }
}
