package p204p;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class j3s0 extends ConstraintLayout {
    public j3s0(Context context) {
        super(context);
        setId(R.id.card_root);
        setLayoutParams(new h6j(-2, -2));
        int i = (int) ((12 * getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        int iM52315x = m52315x(4);
        int iM52315x2 = m52315x(2);
        int iM52315x3 = m52315x(8);
        ArtworkView artworkView = new ArtworkView(getContext(), null, 0, 6, null);
        artworkView.setId(R.id.artwork);
        artworkView.setDuplicateParentStateEnabled(true);
        artworkView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        artworkView.setPlaceholderInsetRatio(0.5f);
        h6j h6jVar = new h6j(-1, 0);
        ((ViewGroup.MarginLayoutParams) h6jVar).bottomMargin = iM52315x3;
        h6jVar.f88109G = "H,1:1";
        h6jVar.f88145i = 0;
        h6jVar.f88164t = 0;
        h6jVar.f88166v = 0;
        h6jVar.f88149k = R.id.title;
        addView(artworkView, h6jVar);
        View downloadBadgeView = new DownloadBadgeView(getContext(), null, 0, 6, null);
        downloadBadgeView.setId(R.id.download_badge_title);
        downloadBadgeView.setContentDescription(null);
        downloadBadgeView.setVisibility(8);
        h6j h6jVar2 = new h6j(0, i);
        h6jVar2.setMarginEnd(iM52315x);
        ((ViewGroup.MarginLayoutParams) h6jVar2).topMargin = iM52315x2;
        h6jVar2.f88109G = "1:1";
        h6jVar2.f88164t = 0;
        h6jVar2.f88165u = R.id.title;
        h6jVar2.f88145i = R.id.title;
        h6jVar2.f88112J = 0;
        addView(downloadBadgeView, h6jVar2);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.title);
        textView.setDuplicateParentStateEnabled(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(8388611);
        textView.setMaxLines(2);
        textView.setTextAppearance(R.style.TextAppearance_Encore_BodySmallBold);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.baseTextBase, typedValue, true);
        textView.setTextColor(typedValue.data);
        textView.setTextDirection(5);
        h6j h6jVar3 = new h6j(0, -2);
        h6jVar3.f88163s = R.id.download_badge_title;
        h6jVar3.f88166v = R.id.artwork;
        h6jVar3.f88147j = R.id.artwork;
        h6jVar3.f88149k = R.id.subtitle;
        addView(textView, h6jVar3);
        View downloadBadgeView2 = new DownloadBadgeView(getContext(), null, 0, 6, null);
        downloadBadgeView2.setId(R.id.download_badge_subtitle);
        downloadBadgeView2.setContentDescription(null);
        downloadBadgeView2.setVisibility(8);
        h6j h6jVar4 = new h6j(0, i);
        h6jVar4.setMarginEnd(iM52315x);
        ((ViewGroup.MarginLayoutParams) h6jVar4).topMargin = iM52315x2;
        h6jVar4.f88109G = "1:1";
        h6jVar4.f88164t = 0;
        h6jVar4.f88165u = R.id.subtitle;
        h6jVar4.f88145i = R.id.subtitle;
        h6jVar4.f88112J = 0;
        addView(downloadBadgeView2, h6jVar4);
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.subtitle);
        textView2.setDuplicateParentStateEnabled(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(8388611);
        textView2.setMaxLines(2);
        textView2.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
        TypedValue typedValue2 = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.baseTextSubdued, typedValue2, true);
        textView2.setTextColor(typedValue2.data);
        textView2.setTextDirection(5);
        h6j h6jVar5 = new h6j(0, -2);
        h6jVar5.f88163s = R.id.download_badge_subtitle;
        h6jVar5.f88166v = R.id.artwork;
        h6jVar5.f88147j = R.id.title;
        addView(textView2, h6jVar5);
    }

    /* JADX INFO: renamed from: x */
    public final int m52315x(int i) {
        return (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
