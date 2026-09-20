package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zko {

    /* JADX INFO: renamed from: b */
    public static final k4l f283788b = new k4l();

    /* JADX INFO: renamed from: c */
    public static final String f283789c = m96329a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: d */
    public static final String f283790d = m96329a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: e */
    public static final C2162nf f283791e = new C2162nf(27);

    /* JADX INFO: renamed from: a */
    public final ksw0 f283792a;

    public zko(ksw0 ksw0Var) {
        this.f283792a = ksw0Var;
    }

    /* JADX INFO: renamed from: a */
    public static String m96329a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
