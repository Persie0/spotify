package androidx.media;

import java.util.Arrays;
import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f953a = 0;

    /* JADX INFO: renamed from: b */
    public int f954b = 0;

    /* JADX INFO: renamed from: c */
    public int f955c = 0;

    /* JADX INFO: renamed from: d */
    public int f956d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f954b == audioAttributesImplBase.f954b) {
            int i2 = this.f955c;
            int i3 = audioAttributesImplBase.f955c;
            int i4 = audioAttributesImplBase.f956d;
            if (i4 == -1) {
                int i5 = audioAttributesImplBase.f953a;
                int i6 = AudioAttributesCompat.f949b;
                if ((i3 & 1) != 1) {
                    i = 4;
                    if ((i3 & 4) != 4) {
                        switch (i5) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i4;
            }
            if (i == 6) {
                i3 |= 4;
            } else if (i == 7) {
                i3 |= 1;
            }
            if (i2 == (i3 & 273) && this.f953a == audioAttributesImplBase.f953a && this.f956d == i4) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f954b), Integer.valueOf(this.f955c), Integer.valueOf(this.f953a), Integer.valueOf(this.f956d)});
    }

    public final String toString() {
        String strM77246e;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f956d != -1) {
            sb.append(" stream=");
            sb.append(this.f956d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f953a;
        int i2 = AudioAttributesCompat.f949b;
        switch (i) {
            case 0:
                strM77246e = "USAGE_UNKNOWN";
                break;
            case 1:
                strM77246e = "USAGE_MEDIA";
                break;
            case 2:
                strM77246e = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM77246e = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM77246e = "USAGE_ALARM";
                break;
            case 5:
                strM77246e = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM77246e = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM77246e = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM77246e = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM77246e = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM77246e = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM77246e = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM77246e = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM77246e = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM77246e = "USAGE_GAME";
                break;
            case 15:
            default:
                strM77246e = s571.m77246e(i, "unknown usage ");
                break;
            case 16:
                strM77246e = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM77246e);
        sb.append(" content=");
        sb.append(this.f954b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f955c).toUpperCase());
        return sb.toString();
    }
}
