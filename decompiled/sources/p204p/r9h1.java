package p204p;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r9h1 {
    protected int zza;

    /* JADX INFO: renamed from: d */
    public static void m75075d(ArrayList arrayList, List list) {
        Charset charset = rbh1.f197602a;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof ich1) {
            ich1 ich1Var = (ich1) list;
            int i = ich1Var.f100822c + size;
            int length = ich1Var.f100821b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = s571.m77242a(length, 3, 2, 1, 10);
                    }
                    ich1Var.f100821b = Arrays.copyOf(ich1Var.f100821b, length);
                } else {
                    ich1Var.f100821b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = list.size() - size2;
                StringBuilder sb = new StringBuilder(String.valueOf(size4).length() + 26);
                sb.append("Element at index ");
                sb.append(size4);
                sb.append(" is null.");
                String string = sb.toString();
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size2) {
                        throw new NullPointerException(string);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo44225a();

    /* JADX INFO: renamed from: b */
    public final byte[] m75076b() {
        try {
            int iMo44225a = mo44225a();
            byte[] bArr = new byte[iMo44225a];
            oah1 oah1Var = new oah1(bArr, iMo44225a);
            gbh1 gbh1Var = (gbh1) this;
            lch1 lch1VarM47121a = hch1.f89793c.m47121a(gbh1Var.getClass());
            bnd1 bnd1Var = oah1Var.f163334d;
            if (bnd1Var == null) {
                bnd1Var = new bnd1(oah1Var);
            }
            lch1VarM47121a.mo32261d(gbh1Var, bnd1Var);
            if (iMo44225a - oah1Var.f163337g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(dq60.m36618r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo44226c(lch1 lch1Var);
}
