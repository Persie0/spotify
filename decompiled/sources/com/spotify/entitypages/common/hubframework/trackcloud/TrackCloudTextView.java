package com.spotify.entitypages.common.hubframework.trackcloud;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.g000;
import p204p.nd81;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/entitypages/common/hubframework/trackcloud/TrackCloudTextView;", "Lcom/spotify/encoremobile/component/textview/EncoreTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/nd81;", "trackCloudText", "Lp/w2a1;", "setTrackCloudText", "(Lp/nd81;)V", "src_main_java_com_spotify_entitypages_common-common"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TrackCloudTextView extends EncoreTextView {

    /* JADX INFO: renamed from: h */
    public nd81 f3901h;

    public TrackCloudTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        nd81 nd81Var = this.f3901h;
        if (nd81Var == null) {
            wj50.m88260d0("trackCloudText");
            throw null;
        }
        String str = nd81Var.f152709e;
        int lineCount = getLineCount();
        int i5 = lineCount - 1;
        if (TextUtils.isEmpty(str) || lineCount <= 0 || getLayout().getEllipsisCount(i5) <= 0) {
            return;
        }
        SpannableString spannableStringM64198a = nd81.m64198a(getContext());
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.gray_70)), 0, spannableString.length(), 33);
        int lineEnd = getLayout().getLineEnd(i5) - getLayout().getEllipsisCount(i5);
        int length = str.length() + spannableStringM64198a.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        int i6 = lineEnd - length;
        if (i6 >= 0) {
            spannableStringBuilder.delete(i6, spannableStringBuilder.length());
            int length2 = spannableStringBuilder.length();
            nd81 nd81Var2 = this.f3901h;
            if (nd81Var2 == null) {
                wj50.m88260d0("trackCloudText");
                throw null;
            }
            spannableStringBuilder.delete(nd81Var2.m64199b(length2), length2);
            spannableStringBuilder.append((CharSequence) spannableStringM64198a);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        setText(spannableStringBuilder);
    }

    public final void setTrackCloudText(nd81 trackCloudText) {
        this.f3901h = trackCloudText;
        setMaxLines(trackCloudText.f152711g);
        setText(trackCloudText.f152705a);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackCloudTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g000.m43251a(this, context);
    }

    public /* synthetic */ TrackCloudTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
