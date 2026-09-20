package p204p;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class jx91 extends oy8 {

    /* JADX INFO: renamed from: X */
    public InetAddress f117071X;

    /* JADX INFO: renamed from: Y */
    public boolean f117072Y;

    /* JADX INFO: renamed from: Z */
    public int f117073Z;

    /* JADX INFO: renamed from: e */
    public final int f117074e;

    /* JADX INFO: renamed from: f */
    public final byte[] f117075f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f117076g;

    /* JADX INFO: renamed from: h */
    public Uri f117077h;

    /* JADX INFO: renamed from: i */
    public DatagramSocket f117078i;

    /* JADX INFO: renamed from: t */
    public MulticastSocket f117079t;

    public jx91() {
        super(true);
        this.f117074e = 8000;
        byte[] bArr = new byte[AudioEpisode.SHOW_URI_FIELD_NUMBER];
        this.f117075f = bArr;
        this.f117076g = new DatagramPacket(bArr, 0, AudioEpisode.SHOW_URI_FIELD_NUMBER);
    }

    @Override // p204p.uio
    public final void close() {
        this.f117077h = null;
        MulticastSocket multicastSocket = this.f117079t;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f117071X;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f117079t = null;
        }
        DatagramSocket datagramSocket = this.f117078i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f117078i = null;
        }
        this.f117071X = null;
        this.f117073Z = 0;
        if (this.f117072Y) {
            this.f117072Y = false;
            m68411f();
        }
    }

    @Override // p204p.uio
    public final Uri getUri() {
        return this.f117077h;
    }

    @Override // p204p.fho
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSource$UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f117073Z;
        DatagramPacket datagramPacket = this.f117076g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f117078i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f117073Z = length;
                m68410d(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER, e);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f117073Z;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f117075f, length2 - i4, bArr, i, iMin);
        this.f117073Z -= iMin;
        return iMin;
    }

    @Override // p204p.uio
    /* JADX INFO: renamed from: u */
    public final long mo28175u(sjo sjoVar) throws UdpDataSource$UdpDataSourceException {
        Uri uri = sjoVar.f209885a;
        this.f117077h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f117077h.getPort();
        m68412j(sjoVar);
        try {
            this.f117071X = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f117071X, port);
            if (this.f117071X.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f117079t = multicastSocket;
                multicastSocket.joinGroup(this.f117071X);
                this.f117078i = this.f117079t;
            } else {
                this.f117078i = new DatagramSocket(inetSocketAddress);
            }
            this.f117078i.setSoTimeout(this.f117074e);
            this.f117072Y = true;
            m68413l(sjoVar);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(2001, e);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(2006, e2);
        }
    }
}
