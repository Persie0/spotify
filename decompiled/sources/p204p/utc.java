package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class utc extends ztc {

    /* JADX INFO: renamed from: c */
    public static final utc f233886c = new utc("CharMatcher.any()", 0);

    /* JADX INFO: renamed from: d */
    public static final utc f233887d = new utc("CharMatcher.ascii()", 1);

    /* JADX INFO: renamed from: e */
    public static final utc f233888e = new utc("CharMatcher.javaIsoControl()", 2);

    /* JADX INFO: renamed from: f */
    public static final utc f233889f = new utc("CharMatcher.none()", 3);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f233890b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utc(String str, int i) {
        super(str);
        this.f233890b = i;
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: c */
    public int mo36930c(CharSequence charSequence, int i) {
        switch (this.f233890b) {
            case 0:
                int length = charSequence.length();
                c95.m31851q(i, length);
                if (i == length) {
                    return -1;
                }
                return i;
            case 3:
                c95.m31851q(i, charSequence.length());
                return -1;
            default:
                return super.mo36930c(charSequence, i);
        }
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: d */
    public int mo36931d(String str) {
        switch (this.f233890b) {
            case 0:
                return str.length() == 0 ? -1 : 0;
            case 3:
                str.getClass();
                return -1;
            default:
                return super.mo36931d(str);
        }
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: e */
    public final boolean mo27173e(char c) {
        switch (this.f233890b) {
            case 0:
                return true;
            case 1:
                return c <= 127;
            case 2:
                return c <= 31 || (c >= 127 && c <= 159);
            default:
                return false;
        }
    }

    @Override // p204p.wtc, p204p.duc
    /* JADX INFO: renamed from: f */
    public duc mo27174f() {
        switch (this.f233890b) {
            case 0:
                return f233889f;
            case 3:
                return f233886c;
            default:
                return super.mo27174f();
        }
    }

    @Override // p204p.duc
    /* JADX INFO: renamed from: g */
    public String mo36932g(String str) {
        switch (this.f233890b) {
            case 0:
                return "";
            case 3:
                return str.toString();
            default:
                return super.mo36932g(str);
        }
    }
}
