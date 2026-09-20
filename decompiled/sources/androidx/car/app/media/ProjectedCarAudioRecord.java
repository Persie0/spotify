package androidx.car.app.media;

import androidx.car.app.C0023j;
import java.io.IOException;
import java.io.InputStream;
import p204p.pxb;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class ProjectedCarAudioRecord extends pxb {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(C0023j c0023j) {
        super(c0023j);
    }

    @Override // p204p.pxb
    public int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            stopRecording();
            return -1;
        }
    }

    @Override // p204p.pxb
    public void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // p204p.pxb
    public void stopRecordingInternal() {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException unused) {
        }
    }
}
