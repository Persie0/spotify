package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vtc extends duc {

    /* JADX INFO: renamed from: a */
    public final char[] f244607a;

    public vtc(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f244607a = charArray;
        Arrays.sort(charArray);
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        return mo27173e(((Character) obj).charValue());
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        return Arrays.binarySearch(this.f244607a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.f244607a) {
            sb.append(duc.m36928a(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
