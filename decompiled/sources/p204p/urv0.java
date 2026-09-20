package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class urv0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f233467a;

    static {
        new si5(23);
    }

    public urv0(Pattern pattern) {
        this.f233467a = pattern;
    }

    /* JADX INFO: renamed from: a */
    public static r2d0 m83869a(urv0 urv0Var, CharSequence charSequence) {
        return vgg1.m85464e(urv0Var.f233467a.matcher(charSequence), 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public static k310 m83870b(urv0 urv0Var, CharSequence charSequence) {
        urv0Var.getClass();
        if (charSequence.length() >= 0) {
            C2570xf c2570xf = new C2570xf(27, urv0Var, charSequence);
            trv0 trv0Var = trv0.f223138h;
            return btz0.m30486J(c2570xf);
        }
        StringBuilder sbM56838j = klh.m56838j(0, "Start index out of bounds: ", ", input length: ");
        sbM56838j.append(charSequence.length());
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.f233467a;
        return new srv0(pattern.pattern(), pattern.flags());
    }

    /* JADX INFO: renamed from: c */
    public final r2d0 m83871c(int i, String str) {
        Matcher matcherRegion = this.f233467a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new r2d0(matcherRegion, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final r2d0 m83872d(CharSequence charSequence) {
        Matcher matcher = this.f233467a.matcher(charSequence);
        if (matcher.matches()) {
            return new r2d0(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m83873e(CharSequence charSequence) {
        return this.f233467a.matcher(charSequence).matches();
    }

    /* JADX INFO: renamed from: f */
    public final String m83874f(CharSequence charSequence, gh00 gh00Var) {
        int i = 0;
        r2d0 r2d0VarM85464e = vgg1.m85464e(this.f233467a.matcher(charSequence), 0, charSequence);
        if (r2d0VarM85464e == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, r2d0VarM85464e.m74521b().f278778a);
            sb.append((CharSequence) gh00Var.invoke(r2d0VarM85464e));
            i = r2d0VarM85464e.m74521b().f278779b + 1;
            r2d0VarM85464e = r2d0VarM85464e.m74522c();
            if (i >= length) {
                break;
            }
        } while (r2d0VarM85464e != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public final String m83875g(String str, String str2) {
        return this.f233467a.matcher(str).replaceAll(str2);
    }

    /* JADX INFO: renamed from: h */
    public final List m83876h(CharSequence charSequence) {
        int iEnd = 0;
        wl51.m88474X0(0);
        Matcher matcher = this.f233467a.matcher(charSequence);
        if (!matcher.find()) {
            return geg1.m44518y(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        return this.f233467a.toString();
    }

    public urv0(String str) {
        this(Pattern.compile(str));
    }
}
