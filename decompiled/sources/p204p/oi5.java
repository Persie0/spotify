package p204p;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes3.dex */
public final class oi5 implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public static final oi5 f165697a = new oi5();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM38555d = edb.m38555d(f3, f2, f, f2);
        float fM38555d2 = edb.m38555d(fPow4, fPow, f, fPow);
        float fM38555d3 = edb.m38555d(fPow5, fPow2, f, fPow2);
        float fM38555d4 = edb.m38555d(fPow6, fPow3, f, fPow3);
        float fPow7 = ((float) Math.pow(fM38555d2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM38555d3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM38555d4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM38555d * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
