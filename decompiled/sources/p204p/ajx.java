package p204p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ajx implements qh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f16370b;

    public /* synthetic */ ajx(int i, int i2) {
        this.f16369a = i2;
        this.f16370b = i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    @Override // p204p.qh00
    public final Object apply(Object obj) {
        boolean z;
        kt0 kt0Var;
        ht0[] ht0VarArr;
        int i;
        ufd0[] ufd0VarArr;
        ufd0[] ufd0VarArr2;
        long[] jArr;
        String[] strArr;
        it0[] it0VarArr;
        int i2;
        it0[] it0VarArr2;
        Bundle bundle;
        it0 it0Var;
        switch (this.f16369a) {
            case 0:
                return Integer.valueOf(this.f16370b);
            case 1:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(mp71.f145918s);
                ufd0 ufd0VarM82981b = bundle3 != null ? ufd0.m82981b(this.f16370b, bundle3) : ufd0.f229755g;
                long j = bundle2.getLong(mp71.f145919t, -9223372036854775807L);
                long j2 = bundle2.getLong(mp71.f145920u, -9223372036854775807L);
                long j3 = bundle2.getLong(mp71.f145921v, -9223372036854775807L);
                boolean z2 = bundle2.getBoolean(mp71.f145922w, false);
                boolean z3 = bundle2.getBoolean(mp71.f145923x, false);
                Bundle bundle4 = bundle2.getBundle(mp71.f145924y);
                nfd0 nfd0VarM64339b = bundle4 != null ? nfd0.m64339b(bundle4) : null;
                boolean z4 = bundle2.getBoolean(mp71.f145925z, false);
                long j4 = bundle2.getLong(mp71.f145910A, 0L);
                long j5 = bundle2.getLong(mp71.f145911B, -9223372036854775807L);
                int i3 = bundle2.getInt(mp71.f145912C, 0);
                int i4 = bundle2.getInt(mp71.f145913D, 0);
                long j6 = bundle2.getLong(mp71.f145914E, 0L);
                Object string = bundle2.getString(mp71.f145915F);
                if (string == null) {
                    string = mp71.f145916q;
                }
                mp71 mp71Var = new mp71();
                mp71Var.m62447d(string, ufd0VarM82981b, null, j, j2, j3, z2, z3, nfd0VarM64339b, j4, j5, i3, i4, j6);
                mp71Var.f145936k = z4;
                return mp71Var;
            default:
                Bundle bundle5 = (Bundle) obj;
                int i5 = bundle5.getInt(bp71.f29336h, 0);
                long j7 = bundle5.getLong(bp71.f29337i, -9223372036854775807L);
                long j8 = bundle5.getLong(bp71.f29338j, 0L);
                boolean z5 = bundle5.getBoolean(bp71.f29339k, false);
                Bundle bundle6 = bundle5.getBundle(bp71.f29340l);
                if (bundle6 != null) {
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList(kt0.f126090h);
                    if (parcelableArrayList == null) {
                        ht0VarArr = new ht0[0];
                    } else {
                        ht0[] ht0VarArr2 = new ht0[parcelableArrayList.size()];
                        int i6 = 0;
                        while (i6 < parcelableArrayList.size()) {
                            Bundle bundle7 = (Bundle) parcelableArrayList.get(i6);
                            long j9 = bundle7.getLong(ht0.f94866m);
                            int i7 = bundle7.getInt(ht0.f94867n);
                            int i8 = bundle7.getInt(ht0.f94873t);
                            ArrayList parcelableArrayList2 = bundle7.getParcelableArrayList(ht0.f94868o);
                            ArrayList parcelableArrayList3 = bundle7.getParcelableArrayList(ht0.f94874u);
                            int[] intArray = bundle7.getIntArray(ht0.f94869p);
                            boolean z6 = z5;
                            long[] longArray = bundle7.getLongArray(ht0.f94870q);
                            long j10 = bundle7.getLong(ht0.f94871r);
                            boolean z7 = bundle7.getBoolean(ht0.f94872s);
                            ArrayList<String> stringArrayList = bundle7.getStringArrayList(ht0.f94875v);
                            int[] iArr = intArray;
                            ArrayList parcelableArrayList4 = bundle7.getParcelableArrayList(ht0.f94877x);
                            int i9 = i6;
                            boolean z8 = bundle7.getBoolean(ht0.f94876w);
                            if (iArr == null) {
                                iArr = new int[0];
                            }
                            if (parcelableArrayList3 != null) {
                                ufd0VarArr2 = new ufd0[parcelableArrayList3.size()];
                                int i10 = 0;
                                while (i10 < parcelableArrayList3.size()) {
                                    Bundle bundle8 = (Bundle) parcelableArrayList3.get(i10);
                                    ufd0VarArr2[i10] = bundle8 == null ? null : ufd0.m82981b(this.f16370b, bundle8);
                                    i10++;
                                    ufd0VarArr2 = ufd0VarArr2;
                                }
                            } else {
                                if (parcelableArrayList2 != null) {
                                    ufd0VarArr2 = new ufd0[parcelableArrayList2.size()];
                                    for (int i11 = 0; i11 < parcelableArrayList2.size(); i11++) {
                                        Uri uri = (Uri) parcelableArrayList2.get(i11);
                                        ufd0VarArr2[i11] = uri == null ? null : ufd0.m82982c(uri);
                                    }
                                } else {
                                    i = 0;
                                    ufd0VarArr = new ufd0[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i];
                                } else {
                                    jArr = longArray;
                                }
                                if (stringArrayList == null) {
                                    strArr = new String[i];
                                } else {
                                    strArr = (String[]) stringArrayList.toArray(new String[i]);
                                }
                                if (parcelableArrayList4 == null) {
                                    it0VarArr2 = new it0[i];
                                } else {
                                    it0VarArr = new it0[parcelableArrayList4.size()];
                                    i2 = 0;
                                    while (i2 < parcelableArrayList4.size()) {
                                        bundle = (Bundle) parcelableArrayList4.get(i2);
                                        if (bundle == null) {
                                            it0Var = null;
                                        } else {
                                            it0Var = new it0(bundle.getLong(it0.f105376d), bundle.getString(it0.f105378f), bundle.getLong(it0.f105377e));
                                        }
                                        it0VarArr[i2] = it0Var;
                                        i2++;
                                        strArr = strArr;
                                    }
                                    it0VarArr2 = it0VarArr;
                                }
                                ht0VarArr2[i9] = new ht0(j9, i7, i8, iArr, ufd0VarArr, jArr, j10, z7, strArr, it0VarArr2, z8);
                                i6 = i9 + 1;
                                z5 = z6;
                            }
                            ufd0VarArr = ufd0VarArr2;
                            i = 0;
                            if (longArray == null) {
                                jArr = new long[i];
                            } else {
                                jArr = longArray;
                            }
                            if (stringArrayList == null) {
                                strArr = new String[i];
                            } else {
                                strArr = (String[]) stringArrayList.toArray(new String[i]);
                            }
                            if (parcelableArrayList4 == null) {
                                it0VarArr2 = new it0[i];
                            } else {
                                it0VarArr = new it0[parcelableArrayList4.size()];
                                i2 = 0;
                                while (i2 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i2);
                                    if (bundle == null) {
                                        it0Var = null;
                                    } else {
                                        it0Var = new it0(bundle.getLong(it0.f105376d), bundle.getString(it0.f105378f), bundle.getLong(it0.f105377e));
                                    }
                                    it0VarArr[i2] = it0Var;
                                    i2++;
                                    strArr = strArr;
                                }
                                it0VarArr2 = it0VarArr;
                            }
                            ht0VarArr2[i9] = new ht0(j9, i7, i8, iArr, ufd0VarArr, jArr, j10, z7, strArr, it0VarArr2, z8);
                            i6 = i9 + 1;
                            z5 = z6;
                        }
                        ht0VarArr = ht0VarArr2;
                    }
                    z = z5;
                    kt0Var = new kt0(ht0VarArr, bundle6.getLong(kt0.f126091i, 0L), bundle6.getLong(kt0.f126092j, -9223372036854775807L), bundle6.getInt(kt0.f126093k, 0));
                } else {
                    z = z5;
                    kt0Var = kt0.f126088f;
                }
                String string2 = bundle5.getString(bp71.f29341m);
                String string3 = bundle5.getString(bp71.f29342n);
                bp71 bp71Var = new bp71();
                bp71Var.m30112i(string2, string3, i5, j7, j8, kt0Var, z);
                return bp71Var;
        }
    }
}
