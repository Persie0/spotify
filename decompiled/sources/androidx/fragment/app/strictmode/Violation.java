package androidx.fragment.app.strictmode;

import kotlin.Metadata;
import p204p.i500;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final i500 f888a;

    public Violation(String str, i500 i500Var) {
        super(str);
        this.f888a = i500Var;
    }
}
