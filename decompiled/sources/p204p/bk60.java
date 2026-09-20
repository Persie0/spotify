package p204p;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class bk60 {

    /* JADX INFO: renamed from: a */
    public final String f27839a;

    public bk60(String str) {
        str.getClass();
        this.f27839a = str;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m29643d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m29644b(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m29643d(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f27839a);
                    sb.append(m29643d(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m29645c(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        m29644b(sb, it);
        return sb.toString();
    }
}
