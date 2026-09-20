package p204p;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xl60 implements Closeable {

    /* JADX INFO: renamed from: a */
    int f263038a;

    /* JADX INFO: renamed from: b */
    int[] f263039b;

    /* JADX INFO: renamed from: c */
    String[] f263040c;

    /* JADX INFO: renamed from: d */
    int[] f263041d;

    /* JADX INFO: renamed from: e */
    boolean f263042e;

    /* JADX INFO: renamed from: f */
    boolean f263043f;

    /* JADX INFO: renamed from: p.xl60$a */
    /* JADX INFO: loaded from: classes11.dex */
    public static /* synthetic */ class C2577a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f263044a;

        static {
            int[] iArr = new int[EnumC2579c.values().length];
            f263044a = iArr;
            try {
                iArr[EnumC2579c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f263044a[EnumC2579c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f263044a[EnumC2579c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f263044a[EnumC2579c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f263044a[EnumC2579c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f263044a[EnumC2579c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: p.xl60$b */
    public static final class C2578b {

        /* JADX INFO: renamed from: a */
        final String[] f263045a;

        /* JADX INFO: renamed from: b */
        final hvl0 f263046b;

        private C2578b(String[] strArr, hvl0 hvl0Var) {
            this.f263045a = strArr;
            this.f263046b = hvl0Var;
        }

        /* JADX INFO: renamed from: a */
        public static C2578b m91389a(String... strArr) {
            try {
                iva[] ivaVarArr = new iva[strArr.length];
                npa npaVar = new npa();
                for (int i = 0; i < strArr.length; i++) {
                    km60.m56881h0(npaVar, strArr[i]);
                    npaVar.readByte();
                    ivaVarArr[i] = npaVar.mo45417J0(npaVar.f156904b);
                }
                return new C2578b((String[]) strArr.clone(), vbg1.m85153x(ivaVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: p.xl60$c */
    public enum EnumC2579c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public xl60() {
        this.f263039b = new int[32];
        this.f263040c = new String[32];
        this.f263041d = new int[32];
    }

    /* JADX INFO: renamed from: z */
    public static xl60 m91379z(gqa gqaVar) {
        return new im60(gqaVar);
    }

    /* JADX INFO: renamed from: B */
    public abstract EnumC2579c mo51068B();

    /* JADX INFO: renamed from: D */
    public abstract xl60 mo51069D();

    /* JADX INFO: renamed from: G */
    public abstract void mo51070G();

    /* JADX INFO: renamed from: I */
    public final void m91380I(int i) {
        int i2 = this.f263038a;
        int[] iArr = this.f263039b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + m91387h());
            }
            this.f263039b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f263040c;
            this.f263040c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f263041d;
            this.f263041d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f263039b;
        int i3 = this.f263038a;
        this.f263038a = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: J */
    public final Object m91381J() {
        switch (C2577a.f263044a[mo51068B().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo51075a();
                while (mo51079i()) {
                    arrayList.add(m91381J());
                }
                mo51077e();
                return arrayList;
            case 2:
                qn80 qn80Var = new qn80();
                mo51076c();
                while (mo51079i()) {
                    String strMo51084s = mo51084s();
                    Object objM91381J = m91381J();
                    Object objPut = qn80Var.put(strMo51084s, objM91381J);
                    if (objPut != null) {
                        StringBuilder sbM38572u = edb.m38572u("Map key '", strMo51084s, "' has multiple values at path ");
                        sbM38572u.append(m91387h());
                        sbM38572u.append(": ");
                        sbM38572u.append(objPut);
                        sbM38572u.append(" and ");
                        sbM38572u.append(objM91381J);
                        throw new JsonDataException(sbM38572u.toString());
                    }
                }
                mo51078f();
                return qn80Var;
            case 3:
                return mo51087y();
            case 4:
                return Double.valueOf(mo51081o());
            case 5:
                return Boolean.valueOf(mo51080n());
            case 6:
                return mo51085t();
            default:
                throw new IllegalStateException("Expected a value but was " + mo51068B() + " at path " + m91387h());
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract int mo51071K(C2578b c2578b);

    /* JADX INFO: renamed from: L */
    public abstract int mo51072L(C2578b c2578b);

    /* JADX INFO: renamed from: M */
    public final void m91382M(boolean z) {
        this.f263043f = z;
    }

    /* JADX INFO: renamed from: N */
    public final void m91383N(boolean z) {
        this.f263042e = z;
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo51073P();

    /* JADX INFO: renamed from: Q */
    public abstract void mo51074Q();

    /* JADX INFO: renamed from: U */
    public final JsonEncodingException m91384U(String str) throws JsonEncodingException {
        StringBuilder sbM75191i = rbz.m75191i(str, " at path ");
        sbM75191i.append(m91387h());
        throw new JsonEncodingException(sbM75191i.toString());
    }

    /* JADX INFO: renamed from: V */
    public final JsonDataException m91385V(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + m91387h());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + m91387h());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo51075a();

    /* JADX INFO: renamed from: c */
    public abstract void mo51076c();

    /* JADX INFO: renamed from: e */
    public abstract void mo51077e();

    /* JADX INFO: renamed from: f */
    public abstract void mo51078f();

    /* JADX INFO: renamed from: g */
    public final boolean m91386g() {
        return this.f263043f;
    }

    /* JADX INFO: renamed from: h */
    public final String m91387h() {
        return zl60.m96359a(this.f263038a, this.f263039b, this.f263040c, this.f263041d);
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo51079i();

    /* JADX INFO: renamed from: k */
    public final boolean m91388k() {
        return this.f263042e;
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo51080n();

    /* JADX INFO: renamed from: o */
    public abstract double mo51081o();

    /* JADX INFO: renamed from: p */
    public abstract int mo51082p();

    /* JADX INFO: renamed from: r */
    public abstract long mo51083r();

    /* JADX INFO: renamed from: s */
    public abstract String mo51084s();

    /* JADX INFO: renamed from: t */
    public abstract <T> T mo51085t();

    /* JADX INFO: renamed from: x */
    public abstract gqa mo51086x();

    /* JADX INFO: renamed from: y */
    public abstract String mo51087y();

    public xl60(xl60 xl60Var) {
        this.f263038a = xl60Var.f263038a;
        this.f263039b = (int[]) xl60Var.f263039b.clone();
        this.f263040c = (String[]) xl60Var.f263040c.clone();
        this.f263041d = (int[]) xl60Var.f263041d.clone();
        this.f263042e = xl60Var.f263042e;
        this.f263043f = xl60Var.f263043f;
    }
}
