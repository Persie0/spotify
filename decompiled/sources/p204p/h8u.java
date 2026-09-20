package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.emoji2.emojipicker.EmojiView;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h8u extends AbstractC1806e9 {

    /* JADX INFO: renamed from: L0 */
    public static final xf40 f88793L0;

    /* JADX INFO: renamed from: Y */
    public static final if40 f88794Y = new if40(new int[]{R.string.emoji_skin_tone_light_content_desc, R.string.emoji_skin_tone_medium_light_content_desc, R.string.emoji_skin_tone_medium_content_desc, R.string.emoji_skin_tone_medium_dark_content_desc, R.string.emoji_skin_tone_dark_content_desc}, 5);

    /* JADX INFO: renamed from: Z */
    public static final if40 f88795Z = new if40(new int[]{R.style.EmojiSkintoneSelectorLight, R.style.EmojiSkintoneSelectorMediumLight, R.style.EmojiSkintoneSelectorMedium, R.style.EmojiSkintoneSelectorMediumDark, R.style.EmojiSkintoneSelectorDark}, 5);

    /* JADX INFO: renamed from: X */
    public int f88796X;

    /* JADX INFO: renamed from: c */
    public final Context f88797c;

    /* JADX INFO: renamed from: d */
    public final View f88798d;

    /* JADX INFO: renamed from: e */
    public final List f88799e;

    /* JADX INFO: renamed from: f */
    public final LinearLayout f88800f;

    /* JADX INFO: renamed from: g */
    public final e8u f88801g;

    /* JADX INFO: renamed from: h */
    public final LayoutInflater f88802h;

    /* JADX INFO: renamed from: i */
    public final LinearLayout f88803i;

    /* JADX INFO: renamed from: t */
    public int f88804t;

    static {
        vf40 vf40Var = new vf40(4);
        vf40Var.mo85345e("🤝", if40.m50414c(R.drawable.handshake_skintone_shadow, R.drawable.handshake_shadow_skintone));
        vf40Var.mo85345e("👭", if40.m50414c(R.drawable.holding_women_skintone_shadow, R.drawable.holding_women_shadow_skintone));
        vf40Var.mo85345e("👫", if40.m50414c(R.drawable.holding_woman_man_skintone_shadow, R.drawable.holding_woman_man_shadow_skintone));
        vf40Var.mo85345e("👬", if40.m50414c(R.drawable.holding_men_skintone_shadow, R.drawable.holding_men_shadow_skintone));
        vf40Var.mo85345e("🧑\u200d🤝\u200d🧑", if40.m50414c(R.drawable.holding_people_skintone_shadow, R.drawable.holding_people_shadow_skintone));
        vf40Var.mo85345e("💏", if40.m50414c(R.drawable.kiss_people_skintone_shadow, R.drawable.kiss_people_shadow_skintone));
        vf40Var.mo85345e("👩\u200d❤️\u200d💋\u200d👨", if40.m50414c(R.drawable.kiss_woman_man_skintone_shadow, R.drawable.kiss_woman_man_shadow_skintone));
        vf40Var.mo85345e("👨\u200d❤️\u200d💋\u200d👨", if40.m50414c(R.drawable.kiss_men_skintone_shadow, R.drawable.kiss_men_shadow_skintone));
        vf40Var.mo85345e("👩\u200d❤️\u200d💋\u200d👩", if40.m50414c(R.drawable.kiss_women_skintone_shadow, R.drawable.kiss_women_shadow_skintone));
        vf40Var.mo85345e("💑", if40.m50414c(R.drawable.couple_heart_people_skintone_shadow, R.drawable.couple_heart_people_shadow_skintone));
        vf40Var.mo85345e("👩\u200d❤️\u200d👨", if40.m50414c(R.drawable.couple_heart_woman_man_skintone_shadow, R.drawable.couple_heart_woman_man_shadow_skintone));
        vf40Var.mo85345e("👨\u200d❤️\u200d👨", if40.m50414c(R.drawable.couple_heart_men_skintone_shadow, R.drawable.couple_heart_men_shadow_skintone));
        vf40Var.mo85345e("👩\u200d❤️\u200d👩", if40.m50414c(R.drawable.couple_heart_women_skintone_shadow, R.drawable.couple_heart_women_shadow_skintone));
        f88793L0 = vf40Var.m85342b(true);
    }

    public h8u(Context context, View view, List list, LinearLayout linearLayout, e8u e8uVar, String str) {
        super(6);
        this.f88797c = context;
        this.f88798d = view;
        this.f88799e = list;
        this.f88800f = linearLayout;
        this.f88801g = e8uVar;
        this.f88802h = LayoutInflater.from(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f88803i = linearLayout2;
        this.f88804t = -1;
        this.f88796X = -1;
        int iIndexOf = list.indexOf(str);
        if (iIndexOf > 0) {
            int i = (iIndexOf - 1) / 5;
            this.f88804t = i;
            this.f88796X = (iIndexOf - (i * 5)) - 1;
        }
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: D0 */
    public final void mo38144D0() {
        LayoutInflater layoutInflater = this.f88802h;
        LinearLayout linearLayout = this.f88803i;
        layoutInflater.inflate(R.layout.emoji_picker_popup_emoji_view, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(R.id.emoji_picker_popup_emoji_view);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setEmoji((CharSequence) this.f88799e.get(0));
        View view = this.f88798d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(this.f88801g);
        ((LinearLayout) linearLayout2.findViewById(R.id.emoji_picker_popup_emoji_view_wrapper)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
        m46848H1();
        this.f88800f.addView(linearLayout);
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: F0 */
    public final void mo38148F0() {
        int i;
        final int i2 = 0;
        while (i2 < 2) {
            final LinearLayout linearLayout = new LinearLayout(this.f88797c);
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            final int i3 = 0;
            while (i3 < 5) {
                this.f88802h.inflate(R.layout.emoji_picker_popup_image_view, linearLayout);
                final ImageView imageView = (ImageView) linearLayout.getChildAt(i3);
                View view = this.f88798d;
                imageView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
                imageView.setClickable(true);
                Context context = imageView.getContext();
                if40 if40Var = f88794Y;
                int iM50417b = R.string.emoji_skin_tone_shadow_content_desc;
                String string = context.getString((i3 != -1 && i2 == 0) ? if40Var.m50417b(i3) : R.string.emoji_skin_tone_shadow_content_desc);
                if (i3 != -1 && i2 != 0) {
                    iM50417b = if40Var.m50417b(i3);
                }
                imageView.setContentDescription(context.getString(R.string.emoji_variant_content_desc_template, string, context.getString(iM50417b)));
                int i4 = this.f88804t;
                if ((i4 != -1 && i2 == 0 && i4 == i3) || ((i = this.f88796X) != -1 && i2 == 1 && i == i3)) {
                    imageView.setSelected(true);
                    imageView.setClickable(false);
                }
                imageView.setImageDrawable(m46847G1(imageView.getContext(), i2, i3));
                imageView.setOnClickListener(new View.OnClickListener() { // from class: p.g8u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        View childAt;
                        int i5 = i2;
                        h8u h8uVar = this;
                        LinearLayout linearLayout2 = linearLayout;
                        int i6 = i3;
                        if (i5 == 0) {
                            int i7 = h8uVar.f88804t;
                            childAt = i7 != -1 ? linearLayout2.getChildAt(i7) : null;
                            h8uVar.f88804t = i6;
                        } else {
                            int i8 = h8uVar.f88796X;
                            childAt = i8 != -1 ? linearLayout2.getChildAt(i8) : null;
                            h8uVar.f88796X = i6;
                        }
                        if (childAt != null) {
                            childAt.setSelected(false);
                            childAt.setClickable(true);
                        }
                        ImageView imageView2 = imageView;
                        imageView2.setClickable(false);
                        imageView2.setSelected(true);
                        h8uVar.m46848H1();
                    }
                });
                i3++;
            }
            this.f88800f.addView(linearLayout);
            i2++;
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m46846F1(int i, int i2, boolean z) {
        ImageView imageView = (ImageView) this.f88802h.inflate(R.layout.emoji_picker_popup_image_view, this.f88803i).findViewById(R.id.emoji_picker_popup_image_view);
        int i3 = 0;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f88798d.getHeight(), 1.0f));
        imageView.setImageDrawable(m46847G1(imageView.getContext(), i, i2));
        if (z) {
            imageView.setImageTintList(ColorStateList.valueOf(-7829368));
        }
        int i4 = this.f88804t;
        int i5 = this.f88796X;
        if (i4 == -1) {
            i3 = i5 != -1 ? 1 : i4;
            i4 = i5;
        }
        Context context = imageView.getContext();
        if40 if40Var = f88794Y;
        int iM50417b = R.string.emoji_skin_tone_shadow_content_desc;
        String string = context.getString((i4 != -1 && i3 == 0) ? if40Var.m50417b(i4) : R.string.emoji_skin_tone_shadow_content_desc);
        if (i4 != -1 && i3 != 0) {
            iM50417b = if40Var.m50417b(i4);
        }
        imageView.setContentDescription(context.getString(R.string.emoji_variant_content_desc_template, string, context.getString(iM50417b)));
    }

    /* JADX INFO: renamed from: G1 */
    public final Drawable m46847G1(Context context, int i, int i2) {
        if40 if40Var = (if40) f88793L0.get(this.f88799e.get(0));
        if (if40Var == null) {
            return null;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f88795Z.m50417b(i2));
        Resources resources = context.getResources();
        int iM50417b = if40Var.m50417b(i);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        ThreadLocal threadLocal = u1x0.f225931a;
        return resources.getDrawable(iM50417b, theme);
    }

    /* JADX INFO: renamed from: H1 */
    public final void m46848H1() {
        LinearLayout linearLayout = this.f88803i;
        int childCount = linearLayout.getChildCount();
        if (childCount < 1 || childCount > 2) {
            return;
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        int i = this.f88804t;
        if (i == -1 || this.f88796X == -1) {
            if (i != -1) {
                m46846F1(0, i, false);
                return;
            }
            int i2 = this.f88796X;
            if (i2 != -1) {
                m46846F1(1, i2, false);
                return;
            } else {
                m46846F1(0, 0, true);
                return;
            }
        }
        this.f88802h.inflate(R.layout.emoji_picker_popup_emoji_view, linearLayout);
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(1);
        EmojiView emojiView = (EmojiView) linearLayout2.findViewById(R.id.emoji_picker_popup_emoji_view);
        emojiView.setWillDrawVariantIndicator$emoji2_emojipicker_release(false);
        emojiView.setClickable(true);
        emojiView.setEmoji((CharSequence) this.f88799e.get((this.f88804t * 5) + this.f88796X + 1));
        emojiView.setOnClickListener(this.f88801g);
        View view = this.f88798d;
        emojiView.setLayoutParams(new LinearLayout.LayoutParams(view.getWidth(), view.getHeight()));
        ((LinearLayout) linearLayout2.findViewById(R.id.emoji_picker_popup_emoji_view_wrapper)).setLayoutParams(new LinearLayout.LayoutParams((view.getWidth() * 5) / 2, view.getHeight()));
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: Y0 */
    public final Context mo38159Y0() {
        return this.f88797c;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: a1 */
    public final View.OnClickListener mo38161a1() {
        return this.f88801g;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: c1 */
    public final int mo38163c1() {
        return 5;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: d1 */
    public final int mo38164d1() {
        return 3;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: g1 */
    public final LinearLayout mo38167g1() {
        return this.f88800f;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: h1 */
    public final View mo38168h1() {
        return this.f88798d;
    }

    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: m1 */
    public final List mo38171m1() {
        return this.f88799e;
    }
}
