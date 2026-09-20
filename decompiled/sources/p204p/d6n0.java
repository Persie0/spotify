package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J+\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u00022\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/d6n0;", "", "Lio/reactivex/rxjava3/core/Single;", "Lp/a6n0;", "c", "()Lio/reactivex/rxjava3/core/Single;", "a", "", "", "categoryIds", "b", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", "p/c6n0", "src_main_java_com_spotify_partnerapps_domain-domain"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface d6n0 {

    /* JADX INFO: renamed from: a */
    public static final c6n0 f45728a = c6n0.f34582a;

    /* JADX INFO: renamed from: b */
    public static final String f45729b = "navigation";

    /* JADX INFO: renamed from: c */
    public static final String f45730c = "voice-assistants";

    /* JADX INFO: renamed from: d */
    public static final String f45731d = "samsung";

    @zk00("partner-client-integrations/v2/categories/voice-assistants")
    /* JADX INFO: renamed from: a */
    Single<a6n0> m35122a();

    @zk00("partner-client-integrations/v2/categories")
    /* JADX INFO: renamed from: b */
    Single<List<a6n0>> m35123b(@hit0("categoryId") List<String> categoryIds);

    @zk00("partner-client-integrations/v2/categories/navigation")
    /* JADX INFO: renamed from: c */
    Single<a6n0> m35124c();
}
