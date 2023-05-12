using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace rennerBank
{
    public partial class FLogin : Form
    {
        public FLogin()
        {
            InitializeComponent();
        }

        private void btnEntrar_Click(object sender, EventArgs e)
        {
            if (txtUsuario.Text.Equals( "admin") && txtSenha.Text.Equals("admin"))
            {
                Fsaldo f = new Fsaldo();
                f.Show();
            }else
            {
                MessageBox.Show("Usuário e senha invalidos");

            }
        }
    }
}
