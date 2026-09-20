package p204p;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class voo {

    /* JADX INFO: renamed from: a */
    public Integer f243514a;

    /* JADX INFO: renamed from: a */
    public final Integer m86102a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.f243514a = Integer.valueOf(unicodeChar & Alert.DURATION_SHOW_INDEFINITELY);
            return null;
        }
        Integer num = this.f243514a;
        if (num == null) {
            return Integer.valueOf(unicodeChar);
        }
        this.f243514a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            unicodeChar = num2.intValue();
        }
        return Integer.valueOf(unicodeChar);
    }
}
