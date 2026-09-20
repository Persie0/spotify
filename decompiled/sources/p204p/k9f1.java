package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k9f1 {
    protected transient int zzb;

    /* JADX INFO: renamed from: f */
    public static void m55796f(List list, List list2) {
        if (list instanceof pbf1) {
            list2.addAll(list);
            return;
        }
        int size = list.size();
        if (list2 instanceof ArrayList) {
            ((ArrayList) list2).ensureCapacity(list2.size() + size);
        } else if (list2 instanceof rbf1) {
            rbf1 rbf1Var = (rbf1) list2;
            int i = rbf1Var.f197592c + size;
            int length = rbf1Var.f197591b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = s571.m77242a(length, 3, 2, 1, 10);
                    }
                    rbf1Var.f197591b = Arrays.copyOf(rbf1Var.f197591b, length);
                } else {
                    rbf1Var.f197591b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list2.size();
        if (!(list instanceof RandomAccess)) {
            for (Object obj : list) {
                if (obj == null) {
                    jaf1.m52810b(size2, list2);
                    throw null;
                }
                list2.add(obj);
            }
            return;
        }
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list.get(i2);
            if (obj2 == null) {
                jaf1.m52810b(size2, list2);
                throw null;
            }
            list2.add(obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo55797a(w780 w780Var);

    /* JADX INFO: renamed from: b */
    public abstract int mo55798b();

    /* JADX INFO: renamed from: c */
    public final r9f1 m55799c() {
        try {
            int iMo55798b = mo55798b();
            r9f1 r9f1Var = s9f1.f206952b;
            byte[] bArr = new byte[iMo55798b];
            w780 w780Var = new w780(bArr, iMo55798b);
            mo55797a(w780Var);
            int i = iMo55798b - w780Var.f248599c;
            if (i > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i >= 0) {
                return new r9f1(bArr);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(dq60.m36618r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m55800d() {
        try {
            int iMo55798b = mo55798b();
            byte[] bArr = new byte[iMo55798b];
            w780 w780Var = new w780(bArr, iMo55798b);
            mo55797a(w780Var);
            int i = iMo55798b - w780Var.f248599c;
            if (i > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(dq60.m36618r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo55801e(vbf1 vbf1Var);
}
