package com.spotify.transcript.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.iq6;
import p204p.p191;
import p204p.w2a1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001b\u0010\u001a\u001a\u00060\u0015R\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/transcript/list/TranscriptListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/reactivex/rxjava3/core/Observable;", "", "k2", "Lio/reactivex/rxjava3/core/Observable;", "getManualScrollObservable", "()Lio/reactivex/rxjava3/core/Observable;", "manualScrollObservable", "Lp/w2a1;", "m2", "getScrollingObservable", "scrollingObservable", "Lp/p191;", "n2", "Lp/p191;", "getScroller", "()Lp/p191;", "scroller", "src_main_java_com_spotify_transcript_list-list"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TranscriptListView extends RecyclerView {

    /* JADX INFO: renamed from: o2 */
    public static final /* synthetic */ int f6894o2 = 0;

    /* JADX INFO: renamed from: j2 */
    public final PublishSubject f6895j2;

    /* JADX INFO: renamed from: k2 */
    public final PublishSubject f6896k2;

    /* JADX INFO: renamed from: l2 */
    public final PublishSubject f6897l2;

    /* JADX INFO: renamed from: m2 */
    public final PublishSubject f6898m2;

    /* JADX INFO: renamed from: n2, reason: from kotlin metadata */
    public final p191 scroller;

    public TranscriptListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final Observable<Boolean> getManualScrollObservable() {
        return this.f6896k2;
    }

    public final p191 getScroller() {
        return this.scroller;
    }

    public final Observable<w2a1> getScrollingObservable() {
        return this.f6898m2;
    }

    public TranscriptListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TranscriptListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PublishSubject publishSubject = new PublishSubject();
        this.f6895j2 = publishSubject;
        this.f6896k2 = publishSubject;
        PublishSubject publishSubject2 = new PublishSubject();
        this.f6897l2 = publishSubject2;
        this.f6898m2 = publishSubject2;
        this.scroller = new p191(this);
        m1018m(new iq6(this, 22));
        setHasFixedSize(true);
    }

    public /* synthetic */ TranscriptListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
