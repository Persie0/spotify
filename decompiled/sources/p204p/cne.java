package p204p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class cne extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dne f39988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cne(dne dneVar, int i) {
        super(0);
        this.f39987a = i;
        this.f39988b = dneVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        String str;
        CharSequence string;
        SpannableString spannableString;
        switch (this.f39987a) {
            case 0:
                Typeface typefaceM82233b = u1x0.m82233b(this.f39988b.f50769a, R.font.spotify_mix_ui_bold);
                return typefaceM82233b == null ? Typeface.create(Typeface.DEFAULT, 1) : typefaceM82233b;
            case 1:
                TextPaint textPaint = new TextPaint(1);
                textPaint.setColor(-1);
                dne dneVar = this.f39988b;
                textPaint.setTextSize(dneVar.f50773e * 9.0f);
                textPaint.setTypeface(dneVar.m36468b());
                return textPaint;
            case 2:
                dne dneVar2 = this.f39988b;
                t2b0 t2b0Var = dneVar2.f50772d;
                if (t2b0Var.isEmpty()) {
                    return lau.f131415a;
                }
                return btz0.m30496T(btz0.m30483G(x2e.f257451g, btz0.m30480D(new m99(6, t2b0Var.f195112a * 1000, t2b0Var.f195113b * 1000), new ek5(dneVar2.f50771c, 1))));
            case 3:
                dne dneVar3 = this.f39988b;
                float f = dneVar3.f50775g;
                float f2 = dneVar3.f50773e;
                float f3 = 8.0f * f2;
                return Float.valueOf((f2 * 12.0f) + (4.0f * f2) + f + f3 + ((StaticLayout) dneVar3.f50789u.getValue()).getHeight() + ((StaticLayout) dneVar3.f50790v.getValue()).getHeight() + f3);
            case 4:
                TextPaint textPaint2 = new TextPaint(1);
                textPaint2.setColor(-1);
                dne dneVar4 = this.f39988b;
                textPaint2.setTextSize(dneVar4.f50773e * 9.0f);
                textPaint2.setTypeface(dneVar4.m36468b());
                return textPaint2;
            case 5:
                TextPaint textPaint3 = new TextPaint(1);
                textPaint3.setColor(-1);
                dne dneVar5 = this.f39988b;
                textPaint3.setTextSize(dneVar5.f50773e * 9.0f);
                textPaint3.setTypeface((Typeface) dneVar5.f50780l.getValue());
                return textPaint3;
            case 6:
                Paint paint = new Paint(1);
                paint.setColor(this.f39988b.f50778j);
                return paint;
            case 7:
                Typeface typefaceM82233b2 = u1x0.m82233b(this.f39988b.f50769a, R.font.spotify_mix_ui_regular);
                return typefaceM82233b2 == null ? Typeface.DEFAULT : typefaceM82233b2;
            case 8:
                dne dneVar6 = this.f39988b;
                wg61 wg61Var = dneVar6.f50786r;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1280, 1104, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f4 = dneVar6.f50773e;
                float f5 = f4 * 8.0f;
                float f6 = dneVar6.f50776h;
                float fM36469c = dneVar6.m36469c();
                float f7 = dneVar6.f50774f;
                float fM36469c2 = dneVar6.m36469c();
                float f8 = dneVar6.f50775g;
                RectF rectF = new RectF(f6, fM36469c, f6 + f7, fM36469c2 + f8);
                Path path = new Path();
                path.addRect(rectF, Path.Direction.CW);
                path.addRoundRect(rectF, f5, f5, Path.Direction.CCW);
                Paint paint2 = new Paint(1);
                paint2.setColor(-16777216);
                canvas.drawPath(path, paint2);
                float fM36469c3 = dneVar6.m36469c() + f8 + f5;
                float f9 = dneVar6.f50776h;
                canvas.save();
                canvas.translate(f9, fM36469c3);
                wg61 wg61Var2 = dneVar6.f50789u;
                ((StaticLayout) wg61Var2.getValue()).draw(canvas);
                canvas.restore();
                float height = (4.0f * f4) + ((StaticLayout) wg61Var2.getValue()).getHeight() + fM36469c3;
                canvas.save();
                canvas.translate(f9, height);
                wg61 wg61Var3 = dneVar6.f50790v;
                ((StaticLayout) wg61Var3.getValue()).draw(canvas);
                canvas.restore();
                float height2 = ((StaticLayout) wg61Var3.getValue()).getHeight() + f5 + height;
                Context context = dneVar6.f50769a;
                float f10 = f4 * 12.0f;
                float f11 = 2;
                float f12 = f10 / f11;
                float f13 = height2 + f12;
                float f14 = f13 - f12;
                float f15 = 3.7083333f * f10;
                dneVar6.m36467a(canvas, R.drawable.spotify_logo, f9, f14, f15, f10);
                wme wmeVar = dneVar6.f50770b;
                int i = wmeVar.f252841c;
                String str2 = wmeVar.f252842d;
                if (i >= 60) {
                    str = (i / 60) + "m " + (i % 60) + "s";
                } else {
                    str = i + "s";
                }
                if (str2 == null || wl51.m88460J0(str2)) {
                    string = context.getString(R.string.clip_card_clip, str);
                } else {
                    CharSequence charSequenceEllipsize = TextUtils.ellipsize(str2, (TextPaint) dneVar6.f50785q.getValue(), (f7 - f15) - f5, TextUtils.TruncateAt.END);
                    String string2 = context.getString(R.string.clip_card_clipped_by, charSequenceEllipsize, str);
                    int iM88458H0 = wl51.m88458H0(string2, charSequenceEllipsize.toString(), 0, false, 6);
                    spannableString = new SpannableString(string2);
                    if (iM88458H0 >= 0) {
                        string = spannableString;
                        spannableString.setSpan(new ane(dneVar6.m36468b(), 0), iM88458H0, charSequenceEllipsize.length() + iM88458H0, 33);
                        string = spannableString;
                    }
                }
                string = spannableString;
                int i2 = (int) (9.0f * f4);
                float f16 = f4 * 2.3f;
                float f17 = i2;
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(string, 0, string.length(), (TextPaint) dneVar6.f50784p.getValue(), (int) ((((f7 - f15) - f5) - f17) - f16)).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
                float lineWidth = (f9 + f7) - ((f17 + f16) + (staticLayoutBuild.getLineCount() > 0 ? staticLayoutBuild.getLineWidth(0) : 0.0f));
                dneVar6.m36467a(canvas, R.drawable.encore_icon_trim_16, lineWidth, f13 - (i2 / 2), f17, f17);
                canvas.save();
                canvas.translate(lineWidth + f17 + f16, f13 - (staticLayoutBuild.getHeight() / 2.0f));
                staticLayoutBuild.draw(canvas);
                canvas.restore();
                float f18 = f10 + f6;
                float fM36469c4 = (11.5f * f4) + dneVar6.m36469c();
                String string3 = context.getString(R.string.clip_card_preview_tag);
                float fMeasureText = ((TextPaint) wg61Var.getValue()).measureText(string3);
                Paint.FontMetrics fontMetrics = ((TextPaint) wg61Var.getValue()).getFontMetrics();
                float f19 = fontMetrics.descent - fontMetrics.ascent;
                float f20 = 3.0f * f4;
                float fMax = Math.max(f10, f19);
                float f21 = f4 * 2.0f;
                canvas.drawRoundRect(new RectF(f18, fM36469c4, (f20 * f11) + fMeasureText + f18, fM36469c4 + fMax), f21, f21, (Paint) dneVar6.f50788t.getValue());
                canvas.drawText(string3, f18 + f20, (((fMax - f19) / f11) + fM36469c4) - fontMetrics.ascent, (TextPaint) wg61Var.getValue());
                return bitmapCreateBitmap;
            case 9:
                dne dneVar7 = this.f39988b;
                String str3 = dneVar7.f50770b.f252840b;
                return StaticLayout.Builder.obtain(str3, 0, str3.length(), (TextPaint) dneVar7.f50782n.getValue(), (int) dneVar7.f50774f).setMaxLines(2).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
            case 10:
                TextPaint textPaint4 = new TextPaint(1);
                dne dneVar8 = this.f39988b;
                textPaint4.setColor(dneVar8.f50777i);
                textPaint4.setTextSize(dneVar8.f50773e * 11.0f);
                textPaint4.setTypeface((Typeface) dneVar8.f50780l.getValue());
                return textPaint4;
            case 11:
                TextPaint textPaint5 = new TextPaint(1);
                textPaint5.setColor(-1);
                dne dneVar9 = this.f39988b;
                textPaint5.setTextSize(dneVar9.f50773e * 9.0f);
                textPaint5.setTypeface(dneVar9.m36468b());
                return textPaint5;
            case 12:
                dne dneVar10 = this.f39988b;
                String str4 = dneVar10.f50770b.f252839a;
                return StaticLayout.Builder.obtain(str4, 0, str4.length(), (TextPaint) dneVar10.f50781m.getValue(), (int) dneVar10.f50774f).setMaxLines(3).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(false).build();
            case 13:
                TextPaint textPaint6 = new TextPaint(1);
                textPaint6.setColor(-1);
                dne dneVar11 = this.f39988b;
                textPaint6.setTextSize(dneVar11.f50773e * 11.0f);
                textPaint6.setTypeface(dneVar11.m36468b());
                return textPaint6;
            default:
                dne dneVar12 = this.f39988b;
                return Float.valueOf(Math.max(dneVar12.f50773e * 16.0f, (1104 - ((Number) dneVar12.f50791w.getValue()).floatValue()) / 2.0f));
        }
    }
}
