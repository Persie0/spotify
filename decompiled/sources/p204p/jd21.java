package p204p;

import com.comscore.streaming.ContentType;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jd21 extends d6a1 implements ld21, en91 {
    @Override // p204p.d6a1
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public abstract jd21 mo35109G0(boolean z);

    @Override // p204p.d6a1
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public abstract jd21 mo35111I0(gn91 gn91Var);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", jxq.f117172e.m54719w((y15) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(mo36063C0());
        if (!mo36061A0().isEmpty()) {
            g6f.m43752x0(mo36061A0(), sb, ", ", "<", ">", null, ContentType.LONG_FORM_ON_DEMAND);
        }
        if (mo36064D0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
