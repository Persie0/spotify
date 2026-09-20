package p204p;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tls0 {

    /* JADX INFO: renamed from: a */
    public static final urv0 f221517a = new urv0("<b\\s([^>]*data-field=\"[^\"]*\"[^>]*)>(.*?)</b>");

    /* JADX INFO: renamed from: b */
    public static final urv0 f221518b = new urv0("data-([\\w-]+)=\"([^\"]*)");

    /* JADX INFO: renamed from: a */
    public static final String m81066a(String str) {
        return bm51.m29801l0(bm51.m29801l0(bm51.m29801l0(bm51.m29801l0(bm51.m29801l0(str, "&amp;", "&"), "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'");
    }
}
