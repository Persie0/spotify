package androidx.car.app.model;

import androidx.core.graphics.drawable.IconCompat;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.Objects;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CarIcon {
    public static final int TYPE_ALERT = 4;
    public static final int TYPE_APP_ICON = 5;
    public static final int TYPE_BACK = 3;
    public static final int TYPE_COMPOSE_MESSAGE = 8;
    public static final int TYPE_CUSTOM = 1;
    public static final int TYPE_ERROR = 6;
    public static final int TYPE_MEDIA_PLAYBACK = 9;
    public static final int TYPE_PAN = 7;
    private static final int TYPE_RESOURCE = 2;
    private static final int TYPE_URI = 4;
    private final IconCompat mIcon;
    private final CarColor mTint;
    private final int mType;
    public static final CarIcon APP_ICON = forStandardType(5);
    public static final CarIcon BACK = forStandardType(3);
    public static final CarIcon ALERT = forStandardType(4);
    public static final CarIcon ERROR = forStandardType(6);
    public static final CarIcon PAN = forStandardType(7);
    public static final CarIcon COMPOSE_MESSAGE = forStandardType(8);
    public static final CarIcon MEDIA_PLAYBACK = forStandardType(9);

    public CarIcon(IconCompat iconCompat, CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = iconCompat;
        this.mTint = carColor;
    }

    private static CarIcon forStandardType(int i) {
        return forStandardType(i, CarColor.DEFAULT);
    }

    private boolean iconCompatEquals(IconCompat iconCompat) {
        int iM396j;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            return iconCompat == null;
        }
        if (iconCompat == null || (iM396j = iconCompat2.m396j()) != iconCompat.m396j()) {
            return false;
        }
        if (iM396j == 2) {
            return Objects.equals(this.mIcon.m395i(), iconCompat.m395i()) && this.mIcon.m394h() == iconCompat.m394h();
        }
        if (iM396j == 4) {
            return Objects.equals(this.mIcon.m397k(), iconCompat.m397k());
        }
        return true;
    }

    private Object iconCompatHash() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int iM396j = iconCompat.m396j();
        if (iM396j != 2) {
            return iM396j == 4 ? this.mIcon.m397k() : Integer.valueOf(iM396j);
        }
        return this.mIcon.m395i() + this.mIcon.m394h();
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
            default:
                return "<unknown>";
            case 3:
                return "BACK";
            case 4:
                return "ALERT";
            case 5:
                return "APP";
            case 6:
                return SearchEndpointResponseKt.RESULT_ERROR;
            case 7:
                return "PAN";
            case 8:
                return "COMPOSE_MESSAGE";
            case 9:
                return "MEDIA_PLAYBACK";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && Objects.equals(this.mTint, carIcon.mTint) && iconCompatEquals(carIcon.mIcon);
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CarColor getTint() {
        return this.mTint;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mTint, iconCompatHash());
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", tint: " + this.mTint + "]";
    }

    private static CarIcon forStandardType(int i, CarColor carColor) {
        return new CarIcon(null, carColor, i);
    }

    private CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}
