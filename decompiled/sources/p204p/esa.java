package p204p;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class esa implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62317a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f62318b;

    /* JADX INFO: renamed from: c */
    public final Serializable f62319c;

    public esa(isl0 isl0Var, C2199o2 c2199o2) {
        this.f62318b = isl0Var;
        this.f62319c = c2199o2;
    }

    /* JADX INFO: renamed from: a */
    public String m39899a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = (ArrayDeque) this.f62319c;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb.append(((dsa) itDescendingIterator.next()).m36754a());
            iMin = i;
        }
        if (itDescendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f62317a) {
            case 0:
                ((ArrayDeque) this.f62319c).removeFirst();
                break;
            default:
                ((isl0) this.f62318b).f105268c.remove((C2199o2) this.f62319c);
                break;
        }
    }

    public esa(Object obj, String str, ArrayDeque arrayDeque) {
        this.f62319c = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new dsa(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                int iMin = Math.min(arrayDeque.size(), 11);
                if (((String[]) this.f62318b) == null) {
                    this.f62318b = new String[12];
                }
                if (((String[]) this.f62318b)[iMin] == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    ((String[]) this.f62318b)[iMin] = iMin == 11 ? str2.concat("...") : str2;
                }
                gsa.m45635i(obj.getClass());
            }
        }
    }
}
