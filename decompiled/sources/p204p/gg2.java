package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/gg2;", "", "", "entityURI", "", "staging", "Lio/reactivex/rxjava3/core/Single;", "Lp/xe2;", "a", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_ageverification_dialog-dialog"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface gg2 {
    @zk00("age-verification/v1/dialog/{entityURI}")
    /* JADX INFO: renamed from: a */
    Single<xe2> m44647a(@ubn0("entityURI") String entityURI, @hit0("staging") boolean staging);
}
